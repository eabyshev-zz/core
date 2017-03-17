package epam.com.exeptions;


/**
 * Created by ermek on 3/12/17.
 */
public class DefaultException {

    public static void main(String[] args) {
        // possible blocks try/finally
        try {
            System.out.println("just 1 try block");
        } finally {
            System.out.println("finally 2");
        }
    }


    void someMethod() {

    }
}
