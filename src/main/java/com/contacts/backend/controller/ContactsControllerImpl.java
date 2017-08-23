package com.contacts.backend.controller;

import com.contacts.backend.data.ContactService;
import com.contacts.backend.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ContactsControllerImpl implements ContactsController {

    @Autowired
    private ContactService service;

    @Override
    public Collection<Contact> searchContacts(@RequestParam(required = true) String nameFilter) {
        Collection<Contact> contactCollection = service.findAllContactsByNameFilter(nameFilter);
        if (contactCollection.size() > 1000)
            throw new NotAcceptableAException(nameFilter);

        return contactCollection;
    }
}
