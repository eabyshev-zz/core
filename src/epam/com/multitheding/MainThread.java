package epam.com.multitheding;

/**
 * Created by Ermek_Abyshev on 3/15/2017.
 */
public class MainThread {
    public static void main( String[] args ) {
        Thread t = new Thread( new LiftOff() );
        t.getState();
        t.start();
        System.out.println("Waiting for LiftOff");
    }


}
