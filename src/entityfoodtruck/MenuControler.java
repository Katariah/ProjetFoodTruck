package entityfoodtruck;

import entityfoodtruck.model.Menu;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Fanny
 */
public class MenuControler {

    public static void createMenu(Menu m) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        em.persist(m);
        transac.commit();
    }

    public static void removeArticle(Menu m) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        if (m != null) {
            em.remove(m);
        }
        transac.commit();
    }

    public static Menu findId(int IdMenu) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("Menu.findByIdMenu");
        q.setParameter("IdMenu", IdMenu);
        Menu m = (Menu) q.getSingleResult();
        return m;
    }

    public static Menu findNomArticle(String nomMenu) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("Menu.findByNomMenu");
        q.setParameter("nomMenu", nomMenu);
        Menu m = (Menu) q.getSingleResult();
        return m;
    }

    public static void updateNomMenu(Menu m, String nomMenu) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        m.setNomMenu(nomMenu);
        if (m != null) {
            em.merge(m);
        }
        transac.commit();
    }

    public static void updateDescriptionMenu(Menu m, String descriptionMenu) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        m.setDescription(descriptionMenu);
        if (m != null) {
            em.merge(m);
        }
        transac.commit();
    }

    public static void updatePrixMenu(Menu m, float prixMenu) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        m.setPrixMenu(prixMenu);
        if (m != null) {
            em.merge(m);
        }
        transac.commit();
    }

    public static void updateUrlMenu(Menu m, String urlMenu) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        m.setUrlMenu(urlMenu);
        if (m != null) {
            em.merge(m);
        }
        transac.commit();
    }

}
