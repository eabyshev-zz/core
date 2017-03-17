package epam.com.inheritance;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class Lion extends Animal
{
    private String pride;


    public Lion( final String name, final Type mammals, final int age, final String pride )
    {
        super( name, mammals, age );
        this.pride = pride;
    }


    @Override
    protected void move()
    {
        System.out.println( "Lion will go" );
    }


    @Override
    protected final void breath()
    {
        System.out.println( "Lion will breath with nose" );
    }


    void roar()
    {
        System.out.println( "Lion is roar" );
    }


    public String getPride()
    {
        return pride;
    }


    public void setPride( final String pride )
    {
        this.pride = pride;
    }
}
