package contact;
public class ContactManagementTest {
    public static void main(String[] args) {
        ContactManagement management = new ContactManagement();

        // Add contacts
        management.addContact(new Contact(1, "Alice", "1234567890"));
        management.addContact(new Contact(2, "Bob", "0987654321"));

        // Display contacts
        management.displayContacts();

        // Remove a contact
        management.removeContact(1);

        // Display contacts again
        management.displayContacts();
    }
}
