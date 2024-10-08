package ordder;
import java.util.LinkedList;

public class OrderTracking {
    private LinkedList<Order> orders;

    public OrderTracking() {
        orders = new LinkedList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order processOrder() {
        return orders.pollFirst();
    }

    public void displayOrders() {
        System.out.println("Customer Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
