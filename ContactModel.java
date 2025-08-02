package model;

import java.util.ArrayList;
import java.util.List;

public class ContactModel {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public boolean removeContact(String name) {
        return contacts.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }
}
