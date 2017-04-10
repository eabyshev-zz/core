package epam.com.stream;

import epam.com.equals.hash.Box;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by eric on 4/10/17.
 */
public class Stream {

    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(0, 15);
        values.add(1, 1);
        values.add(2, 10);
        values.add(3, 100);
        values.add(4, 50);

        Optional<Integer> max = values.stream().max(Integer::compareTo);
        System.out.println(max);

        long count = values.stream().filter(new Integer(100)::equals).count();
        System.out.println(count);
}
}
