package Inventory;

public class InventoryManagementTest {
    public static void main(String[] args) {
        InventoryManagement management = new InventoryManagement();

        // Add products
        management.addProduct(new Product(1, "Laptop", 10));
        management.addProduct(new Product(2, "Smartphone", 20));

        // Display products
        management.displayProducts();

        // Update product quantity
        management.updateProductQuantity(1, 15);

        // Display products again
        management.displayProducts();

        // Remove a product
        management.removeProduct(2);

        // Display products again
        management.displayProducts();
    }
}
