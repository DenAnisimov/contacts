package org.example.contacts.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ContactsProperties {
    @Value("${contacts.file.location}")
    private String contacts;

    public String getContacts() {
        return contacts;
    }
}
