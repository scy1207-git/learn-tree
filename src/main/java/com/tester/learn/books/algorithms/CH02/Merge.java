package com.tester.learn.books.algorithms.CH02;

import com.tester.learn.books.algorithms.utils.StdOut;

/**
 * Created by leosong on 16/7/7.
 */
public class Merge {


    private Merge() { }

    private static void show(Comparable[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            StdOut.print(a[i] + " ");
            StdOut.println();
        }
    }

    private static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high)
    {
        int i = low;
        int j = mid +1;

        for(int k = low;k<=high;k++)
        {
            aux[k] = a[k];
        }

        for(int k=low;k<=high;k++)
        {
            if(i>mid) a[k] = aux[j++];
        }


    }

    public static void main(String[] args)
    {
        String[] a = {"C","B","A"};

        show(a);
    }


}
