package epam.com.encapsulation;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class Box
{
    private String name;
    private int weight;


    public Box( final String name, final int weight )
    {
        this.name = name;
        setWeight( weight );
    }


    public String getName()
    {
        return name;
    }


    public void setName( final String name )
    {
        this.name = name;
    }


    public int getWeight()
    {
        return weight;
    }


    public void setWeight( final int weight )
    {
        if ( weight > 0 )
        {
            this.weight = weight;
        }
        else
        {
            System.out.println( "Weight should be positive number!" );
        }
    }


    @Override
    public String toString()
    {
        return "Box{" + "name='" + name + '\'' + ", weight=" + weight + '}';
    }
}
