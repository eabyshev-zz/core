package epam.com.equals.hash;


import java.util.HashSet;


/**
 * Created by Ermek_Abyshev on 3/14/2017.
 */
public class Box
{
    protected String name;
    protected int height;
    protected int width;


    public Box( final String name, final int height, final int width )
    {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    @Override
    public int hashCode() {
        return 5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Box box = (Box) o;

        if (height != box.height) {
            return false;
        }
        if (width != box.width) {
            return false;
        }
        return name != null ? name.equals(box.name) : box.name == null;
    }

    @Override
    public String toString()
    {
        return "Box{" + "name='" + name + '\'' + ", height=" + height + ", width=" + width + '}';
    }
}
