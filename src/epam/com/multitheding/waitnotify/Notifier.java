package epam.com.multitheding.waitnotify;

/**
 * Created by Ermek_Abyshev on 3/16/2017.
 */
public class Notifier implements Runnable {

    private final Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " стартовал");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMsg(name + " поток Notifier отработал");
                msg.notifyAll();
                // msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
