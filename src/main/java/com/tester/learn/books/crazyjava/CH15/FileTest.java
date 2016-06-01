package com.tester.learn.books.crazyjava.CH15;

import java.io.File;
import java.io.IOException;

/**
 * Created by leosong on 16-1-25.
 */
public class FileTest {

    public static void main(String[] args) throws IOException
    {
        File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile().getParent());

        File tmpFile = File.createTempFile("aaa",".txt",file);
        tmpFile.deleteOnExit();



    }


}
