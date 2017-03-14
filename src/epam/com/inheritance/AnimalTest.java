package epam.com.inheritance;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class AnimalTest
{
    public static void main( String[] args )
    {
        Lion lion = new Lion( "leo", Type.MAMMALS, 5 );
        Fish fish = new Fish( "nemo", Type.AQUATIC, 2 );

        lion.move();
        lion.breath();

        fish.move();
        fish.breath();
    }
}
