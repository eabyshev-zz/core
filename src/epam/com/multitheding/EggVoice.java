package epam.com.multitheding;

/**
 * Created by Ermek_Abyshev on 3/16/2017.
 */
public class EggVoice extends Thread {

    @Override
    public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    return;
                }
                System.out.println("egg");
            }

    }
}
