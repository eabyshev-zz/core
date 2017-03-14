package epam.com.inheritance;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class Lion extends Animal
{
    public Lion( final String name, final Type mammals, final int age )
    {
        super( name, mammals, age );
    }


    @Override
    protected void move()
    {
        System.out.println( "Lion will go" );
    }


    @Override
    protected void breath()
    {
        System.out.println( "Lion will breath with nose" );
    }

    void roar()
    {
        System.out.println("Lion is roar");
    }
}
