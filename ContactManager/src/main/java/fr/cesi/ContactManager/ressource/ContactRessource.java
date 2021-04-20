package fr.cesi.ContactManager.ressource;

import fr.cesi.ContactManager.entity.Contact;
import fr.cesi.ContactManager.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ContactRessource {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public Contact create(@RequestBody Contact contact) {
        return contactService.create(contact);
    }

    @PutMapping
    public Contact update(@RequestBody Contact contact) {
        return contactService.update(contact);
    }
}
