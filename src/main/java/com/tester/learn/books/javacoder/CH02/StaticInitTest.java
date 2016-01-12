package com.tester.learn.books.javacoder.CH02;

/**
 * Created by leosong on 16-1-11.
 */
public class StaticInitTest {

    static int count =2;

    static
    {
        System.out.println("Static init Test:");
        name = "java";
    }
    static String name =" crazy java";

    public static void main(String[] args)
    {
        System.out.println("count class value:" + StaticInitTest.count);
        System.out.println("name class value: " + StaticInitTest.name);
        StaticInitTest st = new StaticInitTest();
        System.out.println(st.name);
    }

}
