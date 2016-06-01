package com.tester.learn.books.crazyjava.CH15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by leosong on 16-1-29.
 */
public class ReadObject {

    public static void main(String[] args)
    {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt")))
        {
            Person p = (Person)ois.readObject();
            System.out.println(p);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }
}
