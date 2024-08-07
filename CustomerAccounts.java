package Customer;

import java.util.TreeMap;

public class CustomerAccounts {
    private TreeMap<Integer, Customer> accounts;

    public CustomerAccounts() {
        accounts = new TreeMap<>();
    }

    public void addCustomer(Customer customer) {
        accounts.put(customer.getId(), customer);
    }

    public boolean removeCustomer(int customerId) {
        return accounts.remove(customerId) != null;
    }

    public void displayCustomers() {
        System.out.println("Customer Accounts:");
        for (Customer customer : accounts.values()) {
            System.out.println(customer);
        }
    }
}
