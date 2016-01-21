package com.tester.learn.books.javacoder.CH07;

/**
 * Created by leosong on 16-1-21.
 */
public class OverrideTest2 {

    public void info(String name,double count)
    {
        System.out.println("name == " + name);
        System.out.println("count == " + count);
    }

    public void info(String name , int count)
    {
        System.out.println("name 2 =" + name);
        System.out.println("count 2 = " + count);
    }

    public static void main(String[] args)
    {
        OverrideTest2 ot = new OverrideTest2();
        ot.info("it" , 5);
    }


}
