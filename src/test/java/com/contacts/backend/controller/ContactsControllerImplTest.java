package com.contacts.backend.controller;

import com.contacts.backend.data.ContactService;
import com.contacts.backend.model.Contact;
import com.google.common.collect.ImmutableList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Collection;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)


public class ContactsControllerImplTest {
    @Mock
    private ContactService contactService;

    @InjectMocks
    private ContactsControllerImpl controller;

    @Test
    public void testSearchContacts() throws Exception {
        //prepare
        when(contactService.findAllContactsByNameFilter("^.*[aei].*$")).thenReturn(ImmutableList.<Contact>of());
        //testing
        Collection<Contact> contactCollection = controller.searchContacts("^.*[aei].*$");
        //validate
        verify(contactService).findAllContactsByNameFilter("^.*[aei].*$");
    }
}