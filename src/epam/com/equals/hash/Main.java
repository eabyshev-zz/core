package epam.com.equals.hash;


import java.util.HashSet;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class Main
{
    public static void main( String[] args )
    {
        HashSet<Box> hashSet = new HashSet<Box>();

        Box box1 = new Box( "black", 5, 5 );
        Box box2 = new Box( "black", 5, 5 );

        // методы equals hashcode непереопределены
        System.out.println( "Not Override objects:" );
        print( box1, box2 );

        System.out.println( "Contains of HashSet:" );
        hashSet.add( box1 );
        hashSet.add( box2 );

        for ( final Box box : hashSet )
        {
            System.out.println( box.toString() );
        }

        System.out.println();
        box1 = new BoxOverride( "white", 5, 5 );
        box2 = new BoxOverride( "white", 5, 5 );

        // методы equals hashcode переопределены
        System.out.println( "Override objects:" );
        print( box1, box2 );

        System.out.println( "Contains of HashSet:" );
        hashSet.clear();
        hashSet.add( box1 );
        hashSet.add( box2 );

        for ( final Box box : hashSet )
        {
            System.out.println( box.toString() );
        }
    }


    private static void print( final Box box1, final Box box2 )
    {
        System.out.println( box1.toString() );
        System.out.println( box2.toString() );
        System.out.println( "hashcode notOverrideBox: " + box1.hashCode() );
        System.out.println( "hashcode notOverrideBox2: " + box2.hashCode() );
        System.out.println( "equals: " + box1.equals( box2 ) );
    }
}
