package epam.com.multitheding.sync;

/**
 * Created by Ermek_Abyshev on 3/17/2017.
 */
public class CounterThread extends Thread {

    private final Counter counter;


    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (counter) {
            for (int i = 0; i < 100; i++) {
                counter.increaseCounter();
            }
        }
    }
}
