package OrderProcessing;

@FunctionalInterface
public interface OrderProcessor {
    void process(Order order);
}
