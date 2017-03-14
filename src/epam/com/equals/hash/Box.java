package epam.com.equals.hash;


import java.util.HashSet;


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


    public static void main( String[] args )
    {
        Box blackBox = new Box( "black", 5, 5 );
        Box blackBox2 = new Box( "black", 5, 5 );

        // методы equals hashcode не переопределены
        System.out.println( "hashcode blackBox: " + blackBox.hashCode() );
        System.out.println( "hashcode blackBox2: " + blackBox2.hashCode() );

        System.out.println( "equals: " + blackBox.equals( blackBox2 ) );

        HashSet<Box> hashSet = new HashSet<Box>(  );
        hashSet.add( blackBox );
        hashSet.add( blackBox2 );
    }


//    @Override
//    public boolean equals( final Object o )
//    {
//        if ( this == o )
//        {
//            return true;
//        }
//        if ( !( o instanceof Box ) )
//        {
//            return false;
//        }
//
//        final Box box = ( Box ) o;
//
//        if ( height != box.height )
//        {
//            return false;
//        }
//        if ( width != box.width )
//        {
//            return false;
//        }
//        return name.equals( box.name );
//    }
//
//
//    @Override
//    public int hashCode()
//    {
//        int result = name.hashCode();
//        result = 31 * result + height;
//        result = 31 * result + width;
//        return result;
//    }
}
