package com.tester.learn.books.algorithms.utils;

import com.tester.learn.books.algorithms.utils.StdIn;
import com.tester.learn.books.algorithms.utils.StdOut;

import java.util.Comparator;

/**
 * Created by dingshan on 16/7/11.
 */
public class Example {

    public static void sort(Comparable[] a)
    {

    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j)
    {
        Comparable t = a[i]; a[i] = a[j];a[j] = t;
    }


    private static void show(Comparable[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            StdOut.print(a[i] + " ");
         StdOut.println();
        }
    }

    public static boolean isSorted(Comparable[] a)
    {
        for(int i =1;i < a.length;i++)
        {
            if(less(a[i],a[i-1])) return false;

        }
        return true;
    }

    public static void main(String[] args)
    {
        String[] a = StdIn.readStrings();

    }







}
