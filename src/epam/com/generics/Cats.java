package epam.com.generics;

/**
 * Created by Ermek_Abyshev on 4/11/2017.
 */
public enum Cats {
    PUMA(5), LION(2), TIGER(3), KITTY(5);

    private int age;

    Cats(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println(Cats.KITTY);
    }
}
