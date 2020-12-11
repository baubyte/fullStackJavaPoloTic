package Persistence;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Logic.Cliente;
import Logic.Entrada;
import Logic.Juego;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class EntradaJpaController implements Serializable {

    public EntradaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    /**
     * Constructor Vacio
     */
    public EntradaJpaController() {
        //Entity Manager Factory
        emf = Persistence.createEntityManagerFactory("RelacinoesClasesPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Entrada entrada) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente = entrada.getCliente();
            if (cliente != null) {
                cliente = em.getReference(cliente.getClass(), cliente.getId());
                entrada.setCliente(cliente);
            }
            Juego juego = entrada.getJuego();
            if (juego != null) {
                juego = em.getReference(juego.getClass(), juego.getId());
                entrada.setJuego(juego);
            }
            em.persist(entrada);
            if (cliente != null) {
                cliente.getEntradas().add(entrada);
                cliente = em.merge(cliente);
            }
            if (juego != null) {
                juego.getEntradas().add(entrada);
                juego = em.merge(juego);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Entrada entrada) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Entrada persistentEntrada = em.find(Entrada.class, entrada.getId());
            Cliente clienteOld = persistentEntrada.getCliente();
            Cliente clienteNew = entrada.getCliente();
            Juego juegoOld = persistentEntrada.getJuego();
            Juego juegoNew = entrada.getJuego();
            if (clienteNew != null) {
                clienteNew = em.getReference(clienteNew.getClass(), clienteNew.getId());
                entrada.setCliente(clienteNew);
            }
            if (juegoNew != null) {
                juegoNew = em.getReference(juegoNew.getClass(), juegoNew.getId());
                entrada.setJuego(juegoNew);
            }
            entrada = em.merge(entrada);
            if (clienteOld != null && !clienteOld.equals(clienteNew)) {
                clienteOld.getEntradas().remove(entrada);
                clienteOld = em.merge(clienteOld);
            }
            if (clienteNew != null && !clienteNew.equals(clienteOld)) {
                clienteNew.getEntradas().add(entrada);
                clienteNew = em.merge(clienteNew);
            }
            if (juegoOld != null && !juegoOld.equals(juegoNew)) {
                juegoOld.getEntradas().remove(entrada);
                juegoOld = em.merge(juegoOld);
            }
            if (juegoNew != null && !juegoNew.equals(juegoOld)) {
                juegoNew.getEntradas().add(entrada);
                juegoNew = em.merge(juegoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = entrada.getId();
                if (findEntrada(id) == null) {
                    throw new NonexistentEntityException("The entrada with id " + id + " no longer exists.");
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
            Entrada entrada;
            try {
                entrada = em.getReference(Entrada.class, id);
                entrada.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The entrada with id " + id + " no longer exists.", enfe);
            }
            Cliente cliente = entrada.getCliente();
            if (cliente != null) {
                cliente.getEntradas().remove(entrada);
                cliente = em.merge(cliente);
            }
            Juego juego = entrada.getJuego();
            if (juego != null) {
                juego.getEntradas().remove(entrada);
                juego = em.merge(juego);
            }
            em.remove(entrada);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Entrada> findEntradaEntities() {
        return findEntradaEntities(true, -1, -1);
    }

    public List<Entrada> findEntradaEntities(int maxResults, int firstResult) {
        return findEntradaEntities(false, maxResults, firstResult);
    }

    private List<Entrada> findEntradaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Entrada.class));
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

    public Entrada findEntrada(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Entrada.class, id);
        } finally {
            em.close();
        }
    }

    public int getEntradaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Entrada> rt = cq.from(Entrada.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
