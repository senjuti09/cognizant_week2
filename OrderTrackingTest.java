package ordder;

public class OrderTrackingTest {
    public static void main(String[] args) {
        OrderTracking tracking = new OrderTracking();

        // Add orders
        tracking.addOrder(new Order(1, "Pizza"));
        tracking.addOrder(new Order(2, "Pasta"));
        tracking.addOrder(new Order(3, "Burger"));

        // Display orders
        tracking.displayOrders();

        // Process an order
        System.out.println("Processing Order: " + tracking.processOrder());

        // Display orders again
        tracking.displayOrders();
    }
}

