package org.example.contacts;

import org.example.contacts.config.AppConfig;
import org.example.contacts.controller.ContactsReader;
import org.example.contacts.controller.ContactsWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {
            ContactsWriter contactsWriter = context.getBean(ContactsWriter.class);
            contactsWriter.writeContact("\nИванов Иван Иванович;+890999999;someEmail@example.example\n" +
                    "Смирнов Иван Иванович;+890999991;someEmail2@example.example");
            ContactsReader contactsReader = context.getBean(ContactsReader.class);
            System.out.println(contactsReader.readContacts());
        }
    }
}