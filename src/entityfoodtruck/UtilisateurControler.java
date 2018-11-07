package entityfoodtruck;

import entityfoodtruck.model.Utilisateur;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Fanny
 */
public class UtilisateurControler {

    public static void createUser(Utilisateur u) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        em.persist(u);
        transac.commit();
    }

    public static void removeUser(Utilisateur u) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        if (u != null) {
            em.remove(u);
        }
        transac.commit();
    }

    public static Utilisateur findId(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("Utilisateur.findByIdUser");
        q.setParameter("idUser", id);
        Utilisateur u = (Utilisateur) q.getSingleResult();
        return u;
    }

    public static Utilisateur findMail(String mail) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createNamedQuery("Utilisateur.findByMail");
        q.setParameter("mail", mail);
        Utilisateur u = (Utilisateur) q.getSingleResult();
        return u;
    }

    public static void updateUserNom(Utilisateur u, String nom) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        u.setNomUser(nom);
        if (u != null) {
            em.merge(u);
        }
        transac.commit();
    }

    public static void updateUserPrenom(Utilisateur u, String prenom) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        u.setPrenomUser(prenom);
        if (u != null) {
            em.merge(u);
        }
        transac.commit();
    }

    public static void updateUserAdresse(Utilisateur u, String adresse) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        u.setAdresse(adresse);
        if (u != null) {
            em.merge(u);
        }
        transac.commit();
    }

    public static void updateUserCode(Utilisateur u, int code) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        u.setCodePostal(code);
        if (u != null) {
            em.merge(u);
        }
        transac.commit();
    }

    public static void updateUserVille(Utilisateur u, String ville) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        u.setVille(ville);
        if (u != null) {
            em.merge(u);
        }
        transac.commit();
    }

    public static void updateUserMail(Utilisateur u, String mail) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        u.setMail(mail);
        if (u != null) {
            em.merge(u);
        }
        transac.commit();
    }

    public static void updateUserMdp(Utilisateur u, String mdp) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        u.setMdp(mdp);
        if (u != null) {
            em.merge(u);
        }
        transac.commit();
    }

    public static void updateUserTel(Utilisateur u, String tel) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();
        transac.begin();
        u.setTel(tel);
        if (u != null) {
            em.merge(u);
        }
        transac.commit();
    }
}
