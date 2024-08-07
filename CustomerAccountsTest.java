package Customer;

public class CustomerAccountsTest {
    public static void main(String[] args) {
        CustomerAccounts accounts = new CustomerAccounts();

        // Add customers
        accounts.addCustomer(new Customer(1, "Alice", "alice@example.com"));
        accounts.addCustomer(new Customer(2, "Bob", "bob@example.com"));

        // Display customers
        accounts.displayCustomers();

        // Remove a customer
        accounts.removeCustomer(1);

        // Display customers again
        accounts.displayCustomers();
    }
}
