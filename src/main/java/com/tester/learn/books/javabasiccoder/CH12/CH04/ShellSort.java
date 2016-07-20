package com.tester.learn.books.javabasiccoder.CH12.CH04;

/**
 * Created by leosong on 16/7/20.
 */
public class ShellSort {

    public static void shellSort(DataWrap[] data)
    {
        System.out.println("start to sort:");
        int arrayLength = data.length;
        int h = 1;

        while(h <= arrayLength/3)
        {
            h = h*3 +1;
        }

        while(h >0)
        {
            System.out.println("====h value: " + h + "========" );
            for (int i=h; i< arrayLength; i++)
            {
                DataWrap tmp = data[i];
                if(data[i].compareTo(data[i - h]) < 0)
                {
                    int j = i - h;
                    for(; j >= 0 && data[j].compareTo(tmp) > 0;j-=h)
                    {
                        data[j +h] = data[j];
                    }
                    data[j+h] = tmp;
                }
                System.out.println(java.util.Arrays.toString(data));
            }
            h = (h -1)/3;
        }

    }

    public static void main(String[] args)
    {
        DataWrap[] data = {
                new DataWrap(9,""),
                new DataWrap(-16,""),
                new DataWrap(21,""),
                new DataWrap(23,""),
                new DataWrap(-30,""),
                new DataWrap(-49,""),
                new DataWrap(21,""),
                new DataWrap(30,""),
                new DataWrap(30,"")
        };
        System.out.println("before sort: \n" + java.util.Arrays.toString(data));
        shellSort(data);
        System.out.println("after sort: \n" + java.util.Arrays.toString(data));



    }



}
