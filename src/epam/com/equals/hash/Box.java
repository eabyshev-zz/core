package epam.com.equals.hash;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class Box
{
    private String name;
    private int height;
    private int width;


    public Box( final String name, final int height, final int width )
    {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args)
    {
        Box blackBox = new Box( "black", 5,5 );
        Box blackBox2 = new Box( "black", 5,5 );

        Box whiteBox = new Box( "white", 5,5 );

        System.out.println(blackBox.hashCode());
        System.out.println(blackBox2.hashCode());

        System.out.println(blackBox.equals( blackBox2 ));

        System.out.println(whiteBox.hashCode());
    }
}
