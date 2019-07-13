package Creational.Prototype.Serialization;

import java.io.Serializable;
//import org.apache.commons.lang3.serializationutils;

// some libraries use reflection (no need for Serializable)
class Foo implements Serializable
{
    public int stuff;
    public String whatever;
    
    public Foo(int stuff, String whatever)
    {
        this.stuff = stuff;
        this.whatever = whatever;
    }
    
    @Override
    public String toString()
    {
        return "Foo{" +
                "stuff=" + stuff +
                ", whatever='" + whatever + '\'' +
                '}';
    }
}
