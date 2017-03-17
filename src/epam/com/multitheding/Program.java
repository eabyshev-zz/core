package epam.com.multitheding;

/**
 * Created by Ermek_Abyshev on 3/16/2017.
 */
public class Program {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());
        SomeThing thing = new SomeThing();

        Thread myThread = new Thread(thing);
        System.out.println(myThread.getName() + " " + myThread.getState());

        myThread.start();
        System.out.println(myThread.getName() + " " + myThread.getState());

        myThread.sleep(1000);
        System.out.println(myThread.getName() + " " + myThread.getState());

        System.out.println("Main thread finished");

    }
}
