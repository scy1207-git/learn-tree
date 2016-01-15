package com.tester.learn.books.javacoder.CH02;

/**
 * Created by leosong on 16-1-13.
 */
public class StringJoinTest {

    public static void main(String[] args)
    {
        String s1 = "crazyjava";
        String s2 = "crazy" + "java";
        System.out.println(s1 == s2);

        String str1 = "crazy";
        String str2 = "java";
        String s3 = str1 + str2;
        System.out.println(s1 ==s3);
    }
}
