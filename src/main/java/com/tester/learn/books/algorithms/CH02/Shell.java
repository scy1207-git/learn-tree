package com.tester.learn.books.algorithms.CH02;

/**
 * Created by leosong on 16/7/21.
 */
public class Shell {

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    public static void sort(Comparable[] a)
    {
        int N = a.length;
        int h = 1;
        while(h<N/3) {h = 3*h +1;}

        while(h>=1)
        {
            for(int i=h;i<N;i++)
            {
                for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h)
                {

                }
            }
        }


    }


}
