package fr.cesi.ContactManager.service;

import fr.cesi.ContactManager.domain.Contact;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Adrien HAUTOT (adrien.hautot@erudo.fr)
 */
@SpringBootTest()
public class ContactServiceIT {

    @Autowired
    private ContactService contactService;

    @Test
    public void testContactCreateNomNullFail() {
        try {
            new Contact(null,"bob","0640209940");
            fail("ça aurait du planter a la ligne d'avant");
        } catch(Exception e) {
            System.out.println("ça a bien planté");
        }

        try {
            Contact bob = new Contact("bob","bobo","0640209940");
            bob.setNom(null);
            fail("ça aurait du planter a la ligne d'avant");
            //assertFalse(contactService.create(bob).getTelephone().length() < 10);
        } catch (Exception e) {
            System.out.println("ça a bien planté");
        }
    }

    @Test
    public void testContactCreateNomEmptyFail() {
        try {
            new Contact("","bob","0640209940");
            fail("ça aurait du planter a la ligne d'avant");
        } catch(Exception e) {
            System.out.println("ça a bien planté");
        }

        try {
            Contact bob = new Contact("bob","bobo","0640209940");
            bob.setNom("");
            fail("ça aurait du planter a la ligne d'avant");
            //assertFalse(contactService.create(bob).getTelephone().length() < 10);
        } catch (Exception e) {
            System.out.println("ça a bien planté");
        }
    }

    @Test
    public void testContactCreatePrenomNullFail() {
        try {
            new Contact("boby",null,"0640209940");
            fail("ça aurait du planter a la ligne d'avant");
        } catch(Exception e) {
            System.out.println("ça a bien planté");
        }

        try {
            Contact bob = new Contact("bob","bobo","0640209940");
            bob.setPrenom(null);
            fail("ça aurait du planter a la ligne d'avant");
            //assertFalse(contactService.create(bob).getTelephone().length() < 10);
        } catch (Exception e) {
            System.out.println("ça a bien planté");
        }
    }

    @Test
    public void testContactCreatePrenomEmptyFail() {
        try {
            new Contact("boby","","0640209940");
            fail("ça aurait du planter a la ligne d'avant");
        } catch(Exception e) {
            System.out.println("ça a bien planté");
        }

        try {
            Contact bob = new Contact("bob","bobo","0640209940");
            bob.setPrenom("");
            fail("ça aurait du planter a la ligne d'avant");
            //assertFalse(contactService.create(bob).getTelephone().length() < 10);
        } catch (Exception e) {
            System.out.println("ça a bien planté");
        }
    }

    @Test
    public void testContactCreateTelephoneNullFail() {
        try {
            new Contact("boby","bob",null);
            fail("ça aurait du planter a la ligne d'avant");
        } catch(Exception e) {
            System.out.println("ça a bien planté");
        }

        try {
            Contact bob = new Contact("bob","bobo","0640209940");
            bob.setTelephone(null);
            fail("ça aurait du planter a la ligne d'avant");
            //assertFalse(contactService.create(bob).getTelephone().length() < 10);
        } catch (Exception e) {
            System.out.println("ça a bien planté");
        }
    }

    @Test
    public void testContactCreateTelephoneEmptyFail() {
        try {
            new Contact("boby","bob","");
            fail("ça aurait du planter a la ligne d'avant");
        } catch(Exception e) {
            System.out.println("ça a bien planté");
        }

        try {
            Contact bob = new Contact("bob","bobo","0640209940");
            bob.setTelephone("");
            fail("ça aurait du planter a la ligne d'avant");
            //assertFalse(contactService.create(bob).getTelephone().length() < 10);
        } catch (Exception e) {
            System.out.println("ça a bien planté");
        }
    }

    @Test
    public void testContactCreateTelephoneWithMoreThan10Fail() {
        try {
            new Contact("bob","bobo","06402099400");
            fail("ça aurait du planter a la ligne d'avant");
            //assertFalse(contactService.create(bob).getTelephone().length() > 10);
        } catch (Exception e) {
            System.out.println("ça a bien planté");
        }

        try {
            Contact bob = new Contact("bob","bobo","0640209940");
            bob.setTelephone("06402099400");
            fail("ça aurait du planter a la ligne d'avant");
            //assertFalse(contactService.create(bob).getTelephone().length() < 10);
        } catch (Exception e) {
            System.out.println("ça a bien planté");
        }
    }

    @Test
    public void testContactCreateTelephoneWithMoreLess10Fail() {
        try {
            new Contact("bob","bobo","064020994");
            fail("ça aurait du planter a la ligne d'avant");
            //assertFalse(contactService.create(bob).getTelephone().length() < 10);
        } catch (Exception e) {
            System.out.println("ça a bien planté");
        }

        try {
            Contact bob = new Contact("bob","bobo","0640209940");
            bob.setTelephone("064020994");
            fail("ça aurait du planter a la ligne d'avant");
            //assertFalse(contactService.create(bob).getTelephone().length() < 10);
        } catch (Exception e) {
            System.out.println("ça a bien planté");
        }
    }

    @Test
    public void testContactCreateOk() {
        try {
            new Contact("bob","bobo","0640209940");
        } catch (Exception e) {
            fail("ça n'aurait pas du planter");
        }
    }
}
