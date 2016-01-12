package com.tester.learn.tools.readTxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by leosong on 16-1-12.
 */
public class Test {

    public File getFile() throws IOException
    {
        File file = null;
        Class<?> claz = getClass();
        ClassLoader classLoader = claz.getClassLoader();
        file = new File(classLoader.getResource("ShangHai.txt").getFile());
        System.out.println("File:: " + file);
        return file;
    }

    public static void main(String[] args)
    {
        System.out.println("OK");
        Test test = new Test();
        File shangHaiFile = null;
        try{
            shangHaiFile = test.getFile();
            BufferedReader br = new BufferedReader(new FileReader(shangHaiFile));
            System.out.println(br);
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int counter =0;
            while(line != null)
            {

                String[] data = line.toString().split(" ");
                System.out.println(data[0]);
                System.out.println(data[1]);
                line = br.readLine();
                counter++;
            }
            System.out.println(counter);

        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}
