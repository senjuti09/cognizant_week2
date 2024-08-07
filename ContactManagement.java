package contact;
import java.util.Hashtable;

public class ContactManagement {
    private Hashtable<Integer, Contact> contacts;

    public ContactManagement() {
        contacts = new Hashtable<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getId(), contact);
    }

    public boolean removeContact(int contactId) {
        return contacts.remove(contactId) != null;
    }

    public void displayContacts() {
        System.out.println("Contact List:");
        for (Contact contact : contacts.values()) {
            System.out.println(contact);
        }
    }
}
