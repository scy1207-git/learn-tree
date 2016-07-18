package com.tester.learn.books.javabasiccoder.CH12.CH02;

/**
 * Created by dingshan on 16/7/17.
 */
class DataWrap implements Comparable<DataWrap>
{
    int data;
    String flag;
    public DataWrap(int data, String flag)
    {
        this.data = data;
        this.flag = flag;

    }

    public String toString()
    {
        return data + flag;
    }

    public int compareTo(DataWrap dw)
    {
        return this.data > dw.data? 1 :(this.data == dw.data? 0: -1);
    }

}


public class SelectSort {

    public static void selectSort(DataWrap[] data)
    {
        System.out.println("start to sort:");
        int arrayLength = data.length;
        for(int i =0;i < arrayLength -1;i++)
        {
            for (int j =i+1; j< arrayLength;j++)
            {
                if (data[i].compareTo(data[j]) > 0)
                {
                    DataWrap tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
            System.out.println(java.util.Arrays.toString(data));

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

        System.out.println("before sort: \n" + java.util.Arrays.toString(data));
        selectSort(data);
        System.out.println("after sort: \n" + java.util.Arrays.toString(data));
    }





}
