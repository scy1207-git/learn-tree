package com.tester.learn.books.crazyjava;

/**
 * Created by leosong on 16-1-8.
 */
public class TwoDimensionTest {

    public static void main(String[] args)
    {
        int[][] a;
        a = new int[4][];

        for(int i =0;i< a.length;i++)
        {
            System.out.println(a[i]);
        }

        a[0] = new int[2];

        a[0][1] = 6;

        for (int i=0; i<a[0].length; i++)
        {
            System.out.println(a[0][i]);
        }

    }

}
