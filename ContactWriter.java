package ContactManagementSystem;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ContactWriter {
    public void saveContact(String fileName, Contact contact) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(contact);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the contact.");
            e.printStackTrace();
        }
    }
}
