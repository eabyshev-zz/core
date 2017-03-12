package epam.com.exeptions;


/**
 * Created by ermek on 3/12/17.
 */
public class MyError extends Error
{
    public MyError()
    {
    }


    public MyError( final String message )
    {
        super( message );
    }
}
