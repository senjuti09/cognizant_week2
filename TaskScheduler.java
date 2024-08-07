package Thread;
public class TaskScheduler {
    public static void main(String[] args) {
        Task task1 = new Task("Task1");
        Task task2 = new Task("Task2", task1);
        Task task3 = new Task("Task3");

        task1.start();
        task2.start();
        task3.start();

        try {
            task1.join();
            task2.join();
            task3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks have completed.");
    }
}

class Task extends Thread {
    private String name;
    private Thread dependency;

    public Task(String name) {
        this.name = name;
    }

    public Task(String name, Thread dependency) {
        this.name = name;
        this.dependency = dependency;
    }

    @Override
    public void run() {
        if (dependency != null) {
            try {
                dependency.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " is running...");
            if (i == 1) {
                Thread.yield(); // Yield to other threads
            }
            try {
                Thread.sleep(1000); // Pause for a while
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
