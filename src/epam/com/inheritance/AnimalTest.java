package epam.com.inheritance;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class AnimalTest
{
    public static void main( String[] args )
    {
        Lion lion = new Lion( "leo", Type.MAMMALS, 5, "africa" );
        Fish fish = new Fish( "nemo", Type.AQUATIC, 2 );

        // полиморфизм, позднее связывание
        Animal animal = new Lion( "shit", Type.MAMMALS, 2, "south africa" );
        animal.move();
        animal.breath();

        animal = new Fish( "gloria", Type.AQUATIC, 3 );
        animal.move();
        animal.breath();
    }
}
