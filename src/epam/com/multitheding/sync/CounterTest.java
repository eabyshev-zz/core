package epam.com.multitheding.sync;

/**
 * Created by Ermek_Abyshev on 3/20/2017.
 */
public class CounterTest {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            CounterThread ct = new CounterThread(counter);
            ct.start();
        }

        Thread.sleep(500);

        System.out.println("Counter: " + counter.getCounter());
    }
}
