package view;

import model.Contact;

import java.util.List;
import java.util.Scanner;

public class ContactView {
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("\n--- Address Book Menu ---");
        System.out.println("1. Add Contact");
        System.out.println("2. View Contacts");
        System.out.println("3. Delete Contact");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public Contact getContactDetails() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        return new Contact(name, email);
    }

    public String getContactNameToDelete() {
        System.out.print("Enter name to delete: ");
        return scanner.nextLine();
    }

    public void showAllContacts(List<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("--- Contact List ---");
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
