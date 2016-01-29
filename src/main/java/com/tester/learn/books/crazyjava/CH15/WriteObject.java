package com.tester.learn.books.crazyjava.CH15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by leosong on 16-1-29.
 */
public class WriteObject {

    public static void main(String[] args)
    {
        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
            )
        {
            Person per = new Person("sunwukong",500);
            oos.writeObject(per);

        }catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

}
