package epam.com.inheritance;


import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class Animal
{
    private String name;
    private Type type;
    private int age;


    public Animal()
    {
    }


    public Animal( final String name, final Type type, final int age )
    {
        this.name = name;
        this.type = type;
        this.age = age;
    }


    protected void move()
    {
        System.out.println( "Animal should go" );
    }


    protected void breath()
    {
        System.out.println( "Animal should breath" );
    }


    public int getAge()
    {
        return age;
    }


    public void setAge( final int age )
    {
        this.age = age;
    }


    public Type getType()
    {
        return type;
    }


    public void setType( final Type type )
    {
        this.type = type;
    }


    public String getName()
    {
        return name;
    }


    public void setName( final String name )
    {
        this.name = name;
    }
}
