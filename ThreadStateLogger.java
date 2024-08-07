package Thread;
public class ThreadStateLogger {
    public static void main(String[] args) {
        Thread thread = new Thread(new SimpleTask());

        // Log state before starting the thread
        System.out.println("State before starting the thread: " + thread.getState());

        // Start the thread
        thread.start();
        
        // Log state after starting the thread
        System.out.println("State after starting the thread: " + thread.getState());

        // Monitor state during execution
        while (thread.getState() != Thread.State.TERMINATED) {
            System.out.println("Current state: " + thread.getState());
            try {
                Thread.sleep(500); // Sleep for a while to observe state changes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Log state after completion
        System.out.println("State after completion: " + thread.getState());
    }
}

class SimpleTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Running... " + i);
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
