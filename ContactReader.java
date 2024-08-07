package ContactManagementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException; // Import this for FileNotFoundException
import java.io.IOException;
import java.io.ObjectInputStream;

public class ContactReader {
    public Contact readContact(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Contact) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("The contact file was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the contact.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
            e.printStackTrace();
        }
        return null;
    }
}

