/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Logic.HorarioJuego;
import Persistence.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Pared Baez Martin Jose<paredbaez.martin@gmail.com>
 */
public class HorarioJuegoJpaController implements Serializable {

    public HorarioJuegoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    /**
     * Constructor Vacio
     */
    public HorarioJuegoJpaController() {

        //Entity Manager Factory
        emf = Persistence.createEntityManagerFactory("EntregaFinalPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(HorarioJuego horarioJuego) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(horarioJuego);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(HorarioJuego horarioJuego) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            horarioJuego = em.merge(horarioJuego);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = horarioJuego.getId();
                if (findHorarioJuego(id) == null) {
                    throw new NonexistentEntityException("The horarioJuego with id " + id + " no longer exists.");
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
            HorarioJuego horarioJuego;
            try {
                horarioJuego = em.getReference(HorarioJuego.class, id);
                horarioJuego.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The horarioJuego with id " + id + " no longer exists.", enfe);
            }
            em.remove(horarioJuego);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<HorarioJuego> findHorarioJuegoEntities() {
        return findHorarioJuegoEntities(true, -1, -1);
    }

    public List<HorarioJuego> findHorarioJuegoEntities(int maxResults, int firstResult) {
        return findHorarioJuegoEntities(false, maxResults, firstResult);
    }

    private List<HorarioJuego> findHorarioJuegoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(HorarioJuego.class));
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

    public HorarioJuego findHorarioJuego(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(HorarioJuego.class, id);
        } finally {
            em.close();
        }
    }

    public int getHorarioJuegoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<HorarioJuego> rt = cq.from(HorarioJuego.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
