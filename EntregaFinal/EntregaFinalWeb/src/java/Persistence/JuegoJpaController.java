/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Logic.Entrada;
import Logic.Juego;
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
public class JuegoJpaController implements Serializable {

    public JuegoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    /**
     * Constructor Vacio
     */
    public JuegoJpaController() {
        //Entity Manager Factory
        emf = Persistence.createEntityManagerFactory("EntregaFinalPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Juego juego) {
        if (juego.getEntradas() == null) {
            juego.setEntradas(new ArrayList<Entrada>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Entrada> attachedEntradas = new ArrayList<Entrada>();
            for (Entrada entradasEntradaToAttach : juego.getEntradas()) {
                entradasEntradaToAttach = em.getReference(entradasEntradaToAttach.getClass(), entradasEntradaToAttach.getId());
                attachedEntradas.add(entradasEntradaToAttach);
            }
            juego.setEntradas(attachedEntradas);
            em.persist(juego);
            for (Entrada entradasEntrada : juego.getEntradas()) {
                Juego oldJuegoOfEntradasEntrada = entradasEntrada.getJuego();
                entradasEntrada.setJuego(juego);
                entradasEntrada = em.merge(entradasEntrada);
                if (oldJuegoOfEntradasEntrada != null) {
                    oldJuegoOfEntradasEntrada.getEntradas().remove(entradasEntrada);
                    oldJuegoOfEntradasEntrada = em.merge(oldJuegoOfEntradasEntrada);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Juego juego) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Juego persistentJuego = em.find(Juego.class, juego.getId());
            List<Entrada> entradasOld = persistentJuego.getEntradas();
            List<Entrada> entradasNew = juego.getEntradas();
            List<Entrada> attachedEntradasNew = new ArrayList<Entrada>();
            for (Entrada entradasNewEntradaToAttach : entradasNew) {
                entradasNewEntradaToAttach = em.getReference(entradasNewEntradaToAttach.getClass(), entradasNewEntradaToAttach.getId());
                attachedEntradasNew.add(entradasNewEntradaToAttach);
            }
            entradasNew = attachedEntradasNew;
            juego.setEntradas(entradasNew);
            juego = em.merge(juego);
            for (Entrada entradasOldEntrada : entradasOld) {
                if (!entradasNew.contains(entradasOldEntrada)) {
                    entradasOldEntrada.setJuego(null);
                    entradasOldEntrada = em.merge(entradasOldEntrada);
                }
            }
            for (Entrada entradasNewEntrada : entradasNew) {
                if (!entradasOld.contains(entradasNewEntrada)) {
                    Juego oldJuegoOfEntradasNewEntrada = entradasNewEntrada.getJuego();
                    entradasNewEntrada.setJuego(juego);
                    entradasNewEntrada = em.merge(entradasNewEntrada);
                    if (oldJuegoOfEntradasNewEntrada != null && !oldJuegoOfEntradasNewEntrada.equals(juego)) {
                        oldJuegoOfEntradasNewEntrada.getEntradas().remove(entradasNewEntrada);
                        oldJuegoOfEntradasNewEntrada = em.merge(oldJuegoOfEntradasNewEntrada);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = juego.getId();
                if (findJuego(id) == null) {
                    throw new NonexistentEntityException("The juego with id " + id + " no longer exists.");
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
            Juego juego;
            try {
                juego = em.getReference(Juego.class, id);
                juego.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The juego with id " + id + " no longer exists.", enfe);
            }
            List<Entrada> entradas = juego.getEntradas();
            for (Entrada entradasEntrada : entradas) {
                entradasEntrada.setJuego(null);
                entradasEntrada = em.merge(entradasEntrada);
            }
            em.remove(juego);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Juego> findJuegoEntities() {
        return findJuegoEntities(true, -1, -1);
    }

    public List<Juego> findJuegoEntities(int maxResults, int firstResult) {
        return findJuegoEntities(false, maxResults, firstResult);
    }

    private List<Juego> findJuegoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Juego.class));
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

    public Juego findJuego(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Juego.class, id);
        } finally {
            em.close();
        }
    }

    public int getJuegoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Juego> rt = cq.from(Juego.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
