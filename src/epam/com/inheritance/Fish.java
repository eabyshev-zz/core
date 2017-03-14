package epam.com.inheritance;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class Fish extends Animal
{
    public Fish( final String name, final Type type, final int age )
    {
        super( name, type, age );
    }


    @Override
    protected void breath()
    {
        System.out.println( "Fish will breath with gills" );
    }


    @Override
    protected void move()
    {
        System.out.println( "Fish will swim" );
    }
}
