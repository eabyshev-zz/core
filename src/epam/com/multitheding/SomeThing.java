package epam.com.multitheding;

/**
 * Created by Ermek_Abyshev on 3/16/2017.
 */
public class SomeThing implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello from child thread!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
        }
    }
}
