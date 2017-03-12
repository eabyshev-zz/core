package epam.com.exeptions;


/**
 * Created by ermek on 3/12/17.
 */
public class UncheckedExceptions
{
    static void NumberFormatException()
    {
        // NumberFormatException
        String str = "test";
        int b = Integer.parseInt( str );
    }


    static void ArrayIndexOutOfBoundsException()
    {
        // ArrayIndexOutOfBoundsException
        String[] names = { "tom", "dick", "harry" };
        names[3] = "test";
    }


    static void NullPointerException()
    {
        try
        {
            // NullPointerException
            DefaultException exception = null;
            exception.someMethod();
        }
        catch ( NullPointerException e )
        {
            System.out.println("shit it is nullpointer bro");
        }
    }


    static void ArithmeticException()
    {
        try
        {
            // ArithmeticException
            int a = 5 / 0;
            a = 5;
        }
        catch ( ArithmeticException e )
        {
            e.printStackTrace();
            System.out.println("Can not divide to 0");
        }
    }
}
