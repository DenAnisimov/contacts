package org.example.contacts.controller;

import org.example.contacts.data.ContactsProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Component
public class ContactsReader {
    private final ContactsProperties contactsProperties;

    @Autowired
    public ContactsReader(ContactsProperties contactsProperties) {
        this.contactsProperties = contactsProperties;
    }

    public String readContacts() {
        StringBuilder contacts = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(contactsProperties.getContacts()))) {
            while (reader.ready()) {
                contacts.append(reader.readLine() + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return contacts.toString();
    }
}
