/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Logic.Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Logic.Entrada;
import Persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    /**
     * Constructor Vacio
     */
    public ClienteJpaController() {
        //Entity Manager Factory
        emf = Persistence.createEntityManagerFactory("RelacinoesClasesPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) {
        if (cliente.getEntradas() == null) {
            cliente.setEntradas(new ArrayList<Entrada>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Entrada> attachedEntradas = new ArrayList<Entrada>();
            for (Entrada entradasEntradaToAttach : cliente.getEntradas()) {
                entradasEntradaToAttach = em.getReference(entradasEntradaToAttach.getClass(), entradasEntradaToAttach.getId());
                attachedEntradas.add(entradasEntradaToAttach);
            }
            cliente.setEntradas(attachedEntradas);
            em.persist(cliente);
            for (Entrada entradasEntrada : cliente.getEntradas()) {
                Cliente oldClienteOfEntradasEntrada = entradasEntrada.getCliente();
                entradasEntrada.setCliente(cliente);
                entradasEntrada = em.merge(entradasEntrada);
                if (oldClienteOfEntradasEntrada != null) {
                    oldClienteOfEntradasEntrada.getEntradas().remove(entradasEntrada);
                    oldClienteOfEntradasEntrada = em.merge(oldClienteOfEntradasEntrada);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getId());
            List<Entrada> entradasOld = persistentCliente.getEntradas();
            List<Entrada> entradasNew = cliente.getEntradas();
            List<Entrada> attachedEntradasNew = new ArrayList<Entrada>();
            for (Entrada entradasNewEntradaToAttach : entradasNew) {
                entradasNewEntradaToAttach = em.getReference(entradasNewEntradaToAttach.getClass(), entradasNewEntradaToAttach.getId());
                attachedEntradasNew.add(entradasNewEntradaToAttach);
            }
            entradasNew = attachedEntradasNew;
            cliente.setEntradas(entradasNew);
            cliente = em.merge(cliente);
            for (Entrada entradasOldEntrada : entradasOld) {
                if (!entradasNew.contains(entradasOldEntrada)) {
                    entradasOldEntrada.setCliente(null);
                    entradasOldEntrada = em.merge(entradasOldEntrada);
                }
            }
            for (Entrada entradasNewEntrada : entradasNew) {
                if (!entradasOld.contains(entradasNewEntrada)) {
                    Cliente oldClienteOfEntradasNewEntrada = entradasNewEntrada.getCliente();
                    entradasNewEntrada.setCliente(cliente);
                    entradasNewEntrada = em.merge(entradasNewEntrada);
                    if (oldClienteOfEntradasNewEntrada != null && !oldClienteOfEntradasNewEntrada.equals(cliente)) {
                        oldClienteOfEntradasNewEntrada.getEntradas().remove(entradasNewEntrada);
                        oldClienteOfEntradasNewEntrada = em.merge(oldClienteOfEntradasNewEntrada);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cliente.getId();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            List<Entrada> entradas = cliente.getEntradas();
            for (Entrada entradasEntrada : entradas) {
                entradasEntrada.setCliente(null);
                entradasEntrada = em.merge(entradasEntrada);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cliente findCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
