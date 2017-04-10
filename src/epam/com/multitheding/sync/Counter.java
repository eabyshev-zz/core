package epam.com.multitheding.sync;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Ermek_Abyshev on 3/20/2017.
 */
public class Counter {

    private int counter;

    public void increaseCounter() {
        counter++;

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        Collections.sort(names, (a, b) -> b.compareTo(a));    }

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("test");
                System.out.println("test");
            }
        });


    public long getCounter() {
        return counter;
    }
}
