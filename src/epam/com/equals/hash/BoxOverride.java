package epam.com.equals.hash;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class BoxOverride
{
    private String name;
    private int height;
    private int width;


    public BoxOverride( final String name, final int height, final int width )
    {
        this.name = name;
        this.height = height;
        this.width = width;
    }


    public static void main( String[] args )
    {
        BoxOverride blackBox = new BoxOverride( "black", 5, 5 );
        BoxOverride blackBox2 = new BoxOverride( "black", 5, 5 );

        // методы equals hashcode не переопределены
        System.out.println( "hashcode blackBox: " + blackBox.hashCode() );
        System.out.println( "hashcode blackBox2: " + blackBox2.hashCode() );

        System.out.println( "equals: " + blackBox.equals( blackBox2 ) );


    }


    @Override
    public boolean equals( final Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( o == null || getClass() != o.getClass() )
        {
            return false;
        }

        final BoxOverride that = ( BoxOverride ) o;

        if ( height != that.height )
        {
            return false;
        }
        if ( width != that.width )
        {
            return false;
        }
        return name.equals( that.name );
    }


    @Override
    public int hashCode()
    {
        int result = name.hashCode();
        result = 31 * result + height;
        result = 31 * result + width;
        return result;
    }
}
