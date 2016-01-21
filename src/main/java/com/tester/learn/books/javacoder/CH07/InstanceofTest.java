package com.tester.learn.books.javacoder.CH07;

/**
 * Created by leosong on 16-1-20.
 */
public class InstanceofTest {

    public static void main(String[] args)
    {
        System.out.println("OK");
        Object hello = "hello";
        System.out.println("String is a instance of Ojbect:" + (hello instanceof Object));
        System.out.println("Math is a instance of Object:" + (hello instanceof Math));
        System.out.println("String is a instance of Comparable interface: " + (hello instanceof Comparable));


    }

}
