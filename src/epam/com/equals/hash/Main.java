package epam.com.equals.hash;


import java.util.HashSet;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class Main
{
    public static void main( String[] args )
    {
        BoxOverride overrideBox = new BoxOverride( "black", 5, 5 );
        BoxOverride overrideBox2 = new BoxOverride( "black", 5, 5 );

        // методы equals hashcode переопределены
        System.out.println("Override object:");
        System.out.println( "hashcode blackBox: " + overrideBox.hashCode() );
        System.out.println( "hashcode blackBox2: " + overrideBox2.hashCode() );
        System.out.println( "equals: " + overrideBox.equals( overrideBox2 ) );

        Box blackBox = new Box( "black", 5, 5 );
        Box blackBox2 = new Box( "black", 5, 5 );

        // методы equals hashcode не переопределены
        System.out.println("Not override object:");
        System.out.println( "hashcode blackBox: " + blackBox.hashCode() );
        System.out.println( "hashcode blackBox2: " + blackBox2.hashCode() );
        System.out.println( "equals: " + blackBox.equals( blackBox2 ) );

        HashSet<Box> hashSet = new HashSet<Box>(  );
        hashSet.add( blackBox );
        hashSet.add( blackBox2 );

    }
}
