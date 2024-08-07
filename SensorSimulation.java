package Thread;
import java.util.Random;

public class SensorSimulation {
    public static void main(String[] args) {
        Thread sensor1 = new Thread(new Sensor("Sensor1"));
        Thread sensor2 = new Thread(new Sensor("Sensor2"));
        Thread sensor3 = new Thread(new Sensor("Sensor3"));

        sensor1.start();
        sensor2.start();
        sensor3.start();

        try {
            sensor1.join();
            sensor2.join();
            sensor3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All sensor threads have completed.");
    }
}

class Sensor implements Runnable {
    private String name;
    private Random random = new Random();

    public Sensor(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " collected data: " + random.nextInt(100));
            try {
                Thread.sleep(1000); // Simulate data collection interval
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
