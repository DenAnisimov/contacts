package org.example.contacts.controller;

import org.example.contacts.data.ContactsProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Component
public class ContactsWriter {
    private final ContactsProperties contactsProperties;

    @Autowired
    public ContactsWriter(ContactsProperties contactsProperties) {
        this.contactsProperties = contactsProperties;
    }

    public void writeContact(String contact) {
        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter(contactsProperties.getContacts(), true))) {
            writer.write(contact);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}