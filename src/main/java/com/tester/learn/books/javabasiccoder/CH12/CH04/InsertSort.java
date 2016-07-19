package com.tester.learn.books.javabasiccoder.CH12.CH04;

import com.tester.learn.books.javabasiccoder.CH12.CH03.DataWrap;

/**
 * Created by leosong on 16/7/19.
 */
public class InsertSort {

    public static void insertSort(DataWrap[] data)
    {

        System.out.println("start to sort");
        int arrayLength = data.length;
        for(int i =1;i< arrayLength; i++)
        {
            DataWrap tmp = data[i];
            if (data[i].compareTo(data[i-1]) < 0)
            {
                int j = i-1;
                for(; j>=0 && data[j].compareTo(tmp) >0;j--)
                {
                    data[j+1] = data[j];
                }
                data[j+1] = tmp;
            }
            System.out.println(java.util.Arrays.toString(data));
        }

    }






}
