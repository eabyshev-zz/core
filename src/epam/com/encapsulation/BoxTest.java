package epam.com.encapsulation;


import epam.com.equals.hash.*;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class BoxTest
{
    public static void main( String[] args )
    {
        Box blackBox = new Box( "black", 5 );

        // Setting private fields
        blackBox.setName( "black" );
        blackBox.setWeight( 10 );

        // can not set set field directly
//        blackBox.weight = 10;

        System.out.println( blackBox.toString() );
    }
}
