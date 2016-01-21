package com.tester.learn.books.javacoder.CH07;

/**
 * Created by leosong on 16-1-20.
 */
public class ConversionTest {

    public static void main(String[] args)
    {
        Object obj = "Hello";

        String objStr = (String)obj;
        System.out.println(objStr);

        Object objPri = new Integer(5);
        String str = (String)objPri;
        String s = "crazy java";
    }

}
