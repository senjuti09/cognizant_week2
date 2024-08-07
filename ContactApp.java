package ContactManagementSystem;

public class ContactApp {
    public static void main(String[] args) {
        ContactWriter writer = new ContactWriter();
        ContactReader reader = new ContactReader();

        Contact contact = new Contact("John Doe", "123-456-7890", "john.doe@example.com");
        String fileName = "contact.ser";

        writer.saveContact(fileName, contact);

        System.out.println("Saved contact details:");

        Contact readContact = reader.readContact(fileName);
        if (readContact != null) {
            System.out.println("Name: " + readContact.getName());
            System.out.println("Phone: " + readContact.getPhone());
            System.out.println("Email: " + readContact.getEmail());
        }

        System.out.println("Attempting to read a non-existent file:");
        reader.readContact("non_existent_contact.ser");
    }
}
