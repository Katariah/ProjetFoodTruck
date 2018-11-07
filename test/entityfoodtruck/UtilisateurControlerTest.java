/*
 */
package entityfoodtruck;

import entityfoodtruck.model.Utilisateur;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fanny
 */
public class UtilisateurControlerTest {

    EntityManagerFactory emf;
    EntityManager em;

    public UtilisateurControlerTest() {
        emf = Persistence.createEntityManagerFactory("EntityFoodTruckPU");
        em = emf.createEntityManager();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of createUser method, of class UtilisateurControler.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        Utilisateur u = null;
        UtilisateurControler.createUser(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeUser method, of class UtilisateurControler.
     */
    @Test
    public void testRemoveUser() {
        System.out.println("removeUser");
        Utilisateur u = null;
        UtilisateurControler.removeUser(u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findId method, of class UtilisateurControler.
     */
    @Test
    public void testFindId() {
        System.out.println("findId");
        int id = 0;
        Utilisateur expResult = null;
        Utilisateur result = UtilisateurControler.findId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findMail method, of class UtilisateurControler.
     */
    @Test
    public void testFindMail() {
        System.out.println("findMail");
        String mail = "";
        Utilisateur expResult = null;
        Utilisateur result = UtilisateurControler.findMail(mail);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserNom method, of class UtilisateurControler.
     */
    @Test
    public void testUpdateUserNom() {
        System.out.println("updateUserNom");
        Utilisateur u = null;
        String nom = "";
        UtilisateurControler.updateUserNom(u, nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserPrenom method, of class UtilisateurControler.
     */
    @Test
    public void testUpdateUserPrenom() {
        System.out.println("updateUserPrenom");
        Utilisateur u = null;
        String prenom = "";
        UtilisateurControler.updateUserPrenom(u, prenom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserAdresse method, of class UtilisateurControler.
     */
    @Test
    public void testUpdateUserAdresse() {
        System.out.println("updateUserAdresse");
        Utilisateur u = null;
        String adresse = "";
        UtilisateurControler.updateUserAdresse(u, adresse);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserCode method, of class UtilisateurControler.
     */
    @Test
    public void testUpdateUserCode() {
        System.out.println("updateUserCode");
        Utilisateur u = null;
        int code = 0;
        UtilisateurControler.updateUserCode(u, code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserVille method, of class UtilisateurControler.
     */
    @Test
    public void testUpdateUserVille() {
        System.out.println("updateUserVille");
        Utilisateur u = null;
        String ville = "";
        UtilisateurControler.updateUserVille(u, ville);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserMail method, of class UtilisateurControler.
     */
    @Test
    public void testUpdateUserMail() {
        System.out.println("updateUserMail");
        Utilisateur u = null;
        String mail = "";
        UtilisateurControler.updateUserMail(u, mail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserMdp method, of class UtilisateurControler.
     */
    @Test
    public void testUpdateUserMdp() {
        System.out.println("updateUserMdp");
        Utilisateur u = null;
        String mdp = "";
        UtilisateurControler.updateUserMdp(u, mdp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUserTel method, of class UtilisateurControler.
     */
    @Test
    public void testUpdateUserTel() {
        System.out.println("updateUserTel");
        Utilisateur u = null;
        String tel = "";
        UtilisateurControler.updateUserTel(u, tel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
