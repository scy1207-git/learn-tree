package com.tester.learn.books.javabasiccoder.CH08;

import java.io.*;

/**
 * Created by U0138272 on 1/21/2016.
 */


class Wolf implements Serializable
{
    private String name;
    public Wolf(String name)
    {
        System.out.println("structure");
        this.name = name;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj.getClass() == Wolf.class)
        {
            Wolf target = (Wolf)obj;
            return target.name.equals(this.name);
        }
        return false;
    }

    public int hashCode()
    {
        return name.hashCode();
    }

}


public class AutoClose {

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Wolf w = new Wolf("hui tai lang2");
        System.out.println("wolf obj created");
        Wolf w2 = null;
        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.bin"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.bin"));

            )
        {
                oos.writeObject(w);
                oos.flush();
                w2 = (Wolf)ois.readObject();
        }

    }

}
