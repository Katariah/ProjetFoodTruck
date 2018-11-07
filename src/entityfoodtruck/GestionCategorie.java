package entityfoodtruck;

import entityfoodtruck.model.Article;
import entityfoodtruck.model.Categorie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Fanny
 */
public class GestionCategorie {

    public static void createCategorie(String nomCat) {
        Categorie c = new Categorie();
        c.setNomCat(nomCat);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        em.persist(c);
        transac.commit();
    }

    public static void removeCategorie(Categorie c) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        if (c != null) {
            em.remove(c);
        }
        transac.commit();
    }

    public static Categorie findNomCat(String nomCat) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("Categorie.findByNomCat");
        q.setParameter("nomCat", nomCat);
        Categorie c = (Categorie) q.getSingleResult();
        return c;
    }

    public static void updateNomCat(Categorie c, String nomCat) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        c.setNomCat(nomCat);
        if (c != null) {
            em.merge(c);
        }
        transac.commit();
    }

}
