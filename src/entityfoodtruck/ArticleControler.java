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
public class ArticleControler {

    public static void createArticle(Article a) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        em.persist(a);
        transac.commit();
    }

    public static void removeArticle(Article a) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        if (a != null) {
            em.remove(a);
        }
        transac.commit();
    }

    public static Article findId(int idArticle) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("Article.findByIdArticle");
        q.setParameter("idArticle", idArticle);
        Article a = (Article) q.getSingleResult();
        return a;
    }

    public static Article findNomArticle(String nomArticle) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("Article.findByNomArticle");
        q.setParameter("nomArticle", nomArticle);
        Article a = (Article) q.getSingleResult();
        return a;
    }

    public static void updateNomArticle(Article a, String nomArticle) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        a.setNomArticle(nomArticle);
        if (a != null) {
            em.merge(a);
        }
        transac.commit();
    }

    public static void updateDescriptionArticle(Article a, String descriptionArticle) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        a.setDescriptionArticle(descriptionArticle);
        if (a != null) {
            em.merge(a);
        }
        transac.commit();
    }

    public static void updatePrixArticle(Article a, float prixArticle) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        a.setPrixArticle(prixArticle);
        if (a != null) {
            em.merge(a);
        }
        transac.commit();
    }

    public static void updateUrlArticle(Article a, String urlArticle) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        a.setUrlArticle(urlArticle);
        if (a != null) {
            em.merge(a);
        }
        transac.commit();
    }

    public static void updateIdCat(Article a, Categorie idCat) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        a.setIdCat(idCat);
        if (a != null) {
            em.merge(a);
        }
        transac.commit();
    }

}
