package epam.com.equals.hash;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class BoxOverride extends Box
{
    public BoxOverride( final String name, final int height, final int width )
    {
        super( name, height, width );
    }


    @Override
    public boolean equals( final Object o )
    {
        if ( this == o )
        {
            return true;
        }
        if ( !( o instanceof BoxOverride ) )
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
