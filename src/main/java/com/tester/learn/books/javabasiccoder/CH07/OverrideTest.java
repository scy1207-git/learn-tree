package com.tester.learn.books.javabasiccoder.CH07;

/**
 * Created by leosong on 16-1-21.
 */
public class OverrideTest {

    public void info(String name,double count)
    {
        System.out.println("name : " + name);
        System.out.println("count : " + count);
    }

    public static void main(String[] args)
    {
        OverrideTest ot = new OverrideTest();
        ot.info("crazy", 5);
    }


}
