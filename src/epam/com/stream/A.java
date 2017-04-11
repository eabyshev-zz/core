package epam.com.stream;

/**
 * Created by Ermek_Abyshev on 4/10/2017.
 */
public class A {

    private int a = 20;

    public int foo(A a) {
        return a.a +=1;
    }

    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.foo(a));

        Double d = null;

        System.out.println("test: " + d);
        System.out.println(5%2);
    }
}
