package com.tester.learn.books.javacoder.CH02;

/**
 * Created by leosong on 16-1-13.
 */
public class StringJoinTest2 {

    public static void main(String[] args)
    {
        System.out.println("ok2");
        String s1 = "crazyjava";
        String s2 = "crazy" + "java";
        System.out.println(s1 ==s2);

        final String str1 = "crazy";
        final String str2 = "java";
        String s3 = str1 + str2;

        System.out.println(s1 == s3);

    }
}
