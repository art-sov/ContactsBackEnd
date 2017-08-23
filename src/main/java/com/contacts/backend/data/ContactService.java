package com.contacts.backend.data;

import com.contacts.backend.model.Contact;

import java.util.List;

public interface ContactService {
    List<Contact> findAllContactsByNameFilter(String nameFilter);
}
