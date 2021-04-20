package fr.cesi.ContactManager.service;

import fr.cesi.ContactManager.entity.Contact;
import fr.cesi.ContactManager.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Adrien HAUTOT (adrien.hautot@erudo.fr)
 */
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact create(Contact contact) {
        return contactRepository.save(contact);
    }

    public Contact update(Contact contact) {
        if (contact != null && contact.getId()!=null){
            contact = contactRepository.save(contact);
        } else {
            contact = create(contact);
        }
        return contact;
    }
}
