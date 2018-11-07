/*
 */
package entityfoodtruck;


import entityfoodtruck.model.Utilisateur;
import java.sql.Date;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Fanny
 */
public class EntityFoodTruck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Utilisateur u = new Utilisateur();
//        u.setAdresse("Rue Victor Hugo");
//        u.setCodePostal(30000);
////        java.util.Date aujou = new Date(Calendar.getInstance().getTimeInMillis());
//        Calendar c = Calendar.getInstance();
//        c.set(1991, 10, 10);
//        java.sql.Date d = new Date(c.getTimeInMillis());
//        u.setDateNaiss(d);
//        u.setMail("faux@gmail.com");
//        u.setMdp("qwerty");
//        u.setNomUser("Kata");
//        u.setPrenomUser("Bibi");
//        u.setTel("452555979");
//        u.setVille("Nîmes");
//        u.setTypeCompte("Normal");
        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction transac = em.getTransaction();
//        transac.begin();
//         em.persist(u);
        
//      Retrait d'une ligne de la bdd  
//        Query q = em.createNamedQuery("Utilisateur.findByNomUser");
//        q.setParameter("nomUser", "Kata");
//        Utilisateur u = (Utilisateur) q.getSingleResult();
//        if(u!=null) System.out.println(u.getIdUser());
//        em.remove(u);
//        em.refresh(u);
//        System.out.println(u);
//        em.persist(u);
//        transac.commit();

//        GestionUtilisateur.createUser("Patoulachi", "Robert", "3 rue des rosiers", 21250, "Pitivier", "grosrobert@gmail.com", "papa", "0655402010", "Client");
//          GestionUtilisateur.removeUser("Kata");
//            Utilisateur u = 
               
//            GestionUtilisateur.updateUser(GestionUtilisateur.findId(8), "Yvette");
    }

}
