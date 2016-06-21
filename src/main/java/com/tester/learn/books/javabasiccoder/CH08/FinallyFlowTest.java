package com.tester.learn.books.javabasiccoder.CH08;

/**
 * Created by leosong on 16-1-22.
 */
public class FinallyFlowTest {

    public static void main(String[] args)
    {
        int a = test();
        System.out.println(a);
    }

    public static int test()
    {
        int count = 5;
        try
        {
            return count++;
        }
        finally
        {
            System.out.println("finally");
            return ++count;
        }
    }


}
