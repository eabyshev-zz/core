package epam.com.classes;


/**
 * Created by ermek on 3/12/17.
 */
public class Box
{
    private String name;
    private int height;
    private int width;


    public Box( final String name )
    {
        this.name = name;
    }


    public Box( final String name, final int height, final int width )
    {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public void draw( final int x1, final int x2, final int y1, final int y2 )
    {
        System.out.println("draw using coordinates: x1, x2, y1, y2 ");
    }

    public void draw( final int x1, final int x2, final int y1, final int y2, boolean isFilled  )
    {
        System.out.println("draw filled box.");
    }

    public String getName()
    {
        return name;
    }


    public void setName( final String name )
    {
        this.name = name;
    }


    public int getHeight()
    {
        return height;
    }


    public void setHeight( final int height )
    {
        this.height = height;
    }


    public int getWidth()
    {
        return width;
    }


    public void setWidth( final int width )
    {
        this.width = width;
    }
}
