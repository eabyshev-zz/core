package epam.com.equals.hash;


import java.util.HashSet;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class Box
{
    protected String name;
    protected int height;
    protected int width;


    public Box( final String name, final int height, final int width )
    {
        this.name = name;
        this.height = height;
        this.width = width;
    }


    @Override
    public String toString()
    {
        return "Box{" + "name='" + name + '\'' + ", height=" + height + ", width=" + width + '}';
    }
}
