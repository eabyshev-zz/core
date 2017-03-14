package epam.com.exeptions;


/**
 * Created by ermek on 3/12/17.
 */
public class Main
{
    public static void main( String[] args )
    {
        try
        {
            throw new Error( "my error" );
        }
        catch ( Error error )
        {
            error.printStackTrace();
        }
        // custom error

        // handle error
        ErrorDemo demo = new ErrorDemo();
        try
        {
            demo.method1();
        }
        catch ( StackOverflowError error )
        {
            System.out.println( "it is stackoverflow" );
        }

        // custom exception
        try
        {
            demo.validate( 17 );
        }
        catch ( InvalidAgeException e )
        {
            e.printStackTrace();
        }


        // Checked exceptions
        CheckedExceptions.FileNotFoundException();
        CheckedExceptions.IOException();


        // Unchecked exceptions
        UncheckedExceptions.ArithmeticException();
        UncheckedExceptions.ArrayIndexOutOfBoundsException();
        UncheckedExceptions.NullPointerException();
        UncheckedExceptions.NumberFormatException();
    }
}
