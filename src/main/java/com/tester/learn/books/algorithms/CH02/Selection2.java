package com.tester.learn.books.algorithms.CH02;

import static com.tester.learn.books.algorithms.utils.Example.less;

/**
 * Created by leosong on 16/7/21.
 */
public class Selection2 {


    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable t = a[i]; a[i] = a[j];a[j] = t;
    }


    public static void sort(Comparable[] a)
    {
        int N = a.length;
        for(int i=0;i< N;i++)
        {
            int min = i;
            for (int j = i+1;j<N;j++)
            {
                if(less(a[j],a[min])) min =j;
                exch(a,i,min);
            }
        }
    }



}
