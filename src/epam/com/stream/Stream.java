package epam.com.stream;

import epam.com.equals.hash.Box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

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
        long count2 = values.stream().filter(line -> new Integer(100).equals(line)).count();
        System.out.println(count);
        System.out.println(count2);

        List<String> mList = Arrays.asList("aa1", "cc2", "cc1", "aa2", "bb1");

//        mList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).forEach(System.out::println);
//        LongStream.range(1,10).forEach(System.out::println);

//        Arrays.asList("aс1", "сс2", "сс3").stream().findAny().ifPresent(System.out::println);

        int a = 5;
//        new Thread(() -> System.out.println("hello world")).start();

        List<String>
            collect =
            mList.stream().filter(line -> !"cc2".equals(line) && !"aa1".equals(line)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
