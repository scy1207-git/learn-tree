package com.tester.learn.books.javabasiccoder.CH07;

/**
 * Created by leosong on 16-1-21.
 */
public class OverrideTest3 {

    public void info(Object obj, double count)
    {
        System.out.println("obj = " + obj);
        System.out.println("count = " + count);
    }

    public void info(Object[] obj, double count)
    {
        System.out.println("obj[]2 =" + obj);
        System.out.println("count2 = " + count);
    }

    public static void main(String[] args)
    {
        OverrideTest3 ot = new OverrideTest3();
        ot.info(null,5);
    }
}
