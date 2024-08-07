package Thread;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    public static void main(String[] args) {
        DataQueue dataQueue = new DataQueue();
        Thread producer1 = new Thread(new Producer(dataQueue));
        Thread producer2 = new Thread(new Producer(dataQueue));
        Thread consumer1 = new Thread(new Consumer(dataQueue));
        Thread consumer2 = new Thread(new Consumer(dataQueue));

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();

        try {
            producer1.join();
            producer2.join();
            consumer1.join();
            consumer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DataQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;

    public synchronized void addData(int data) {
        while (queue.size() == LIMIT) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(data);
        System.out.println("Produced: " + data);
        notifyAll();
    }

    public synchronized int getData() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int data = queue.poll();
        System.out.println("Consumed: " + data);
        notifyAll();
        return data;
    }
}

class Producer implements Runnable {
    private DataQueue dataQueue;

    public Producer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            dataQueue.addData(i);
            try {
                Thread.sleep(1000); // Simulate time taken to produce data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private DataQueue dataQueue;

    public Consumer(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            dataQueue.getData();
            try {
                Thread.sleep(1500); // Simulate time taken to consume data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
