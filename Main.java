import controller.ContactController;
import model.ContactModel;
import view.ContactView;

public class Main {
    public static void main(String[] args) {
        ContactModel model = new ContactModel();
        ContactView view = new ContactView();
        ContactController controller = new ContactController(model, view);

        controller.start();
    }
}
