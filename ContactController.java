package controller;

import model.Contact;
import model.ContactModel;
import view.ContactView;

public class ContactController {
    private ContactModel model;
    private ContactView view;

    public ContactController(ContactModel model, ContactView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        while (true) {
            view.showMenu();
            int choice;
            try {
                choice = Integer.parseInt(view.scanner.nextLine());
            } catch (NumberFormatException e) {
                view.showMessage("Invalid input. Try again.");
                continue;
            }

            switch (choice) {
                case 1:
                    Contact newContact = view.getContactDetails();
                    model.addContact(newContact);
                    view.showMessage("Contact added successfully.");
                    break;

                case 2:
                    view.showAllContacts(model.getAllContacts());
                    break;

                case 3:
                    String name = view.getContactNameToDelete();
                    boolean removed = model.removeContact(name);
                    if (removed) {
                        view.showMessage("Contact removed.");
                    } else {
                        view.showMessage("Contact not found.");
                    }
                    break;

                case 4:
                    view.showMessage("Exiting... Goodbye!");
                    return;

                default:
                    view.showMessage("Invalid choice.");
            }
        }
    }
}
