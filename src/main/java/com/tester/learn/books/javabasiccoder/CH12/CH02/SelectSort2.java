package com.tester.learn.books.javabasiccoder.CH12.CH02;

/**
 * Created by leosong on 16/7/18.
 */
public class SelectSort2 {

    public static void selectSort2(DataWrap[] data)
    {
        System.out.println("start to sort: \n");
        int arrayLength = data.length;
        for(int i=0;i< arrayLength -1; i++)
        {
            int minIndex = i;
            for(int j = i +1;j<arrayLength;j++)
            {
                if(data[minIndex].compareTo(data[j]) > 0)
                {
                    minIndex = j;
                }
                if(minIndex != i)
                {
                    DataWrap tmp = data[i];
                    data[i] = data[minIndex];
                    data[minIndex] = tmp;
                }

            }
        }

    }

    public static void main(String[] args)
    {
        DataWrap[] data = {
                new DataWrap(21,""),
                new DataWrap(30,""),
                new DataWrap(49,""),
                new DataWrap(30,""),
                new DataWrap(16,""),
                new DataWrap(9,"")
        };

        System.out.println("before sort:" + java.util.Arrays.toString(data));
        selectSort2(data);
        System.out.println("after sort:" + java.util.Arrays.toString(data));
    }


}
