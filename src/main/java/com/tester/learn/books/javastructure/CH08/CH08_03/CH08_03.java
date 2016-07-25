package com.tester.learn.books.javastructure.CH08.CH08_03;

/**
 * Created by leosong on 16-6-14.
 */
public class CH08_03 {

    int data[] = new int[]{9,7,5,3,4,6};




    public static void main(String args[])
    {
        System.out.println("原始数据为: \n" );
        CH08_03 test = new CH08_03();
        test.showdata();
        test.select();
        test.showdata();

    }

    void showdata()
    {
        int i;
        for(i=0;i<6;i++)
        {
            System.out.println(data[i]+" ");
        }
        System.out.println("\n");

    }

    void select()
    {
        int tmp;
        for(int i=0;i<data.length;i++)
        {
            for(int j = i+1;j < data.length;j++)
            {
                 if(data[i] >data[j])
                 {
                    tmp = data[i];
                     data[i] = data[j];
                     data[j] =tmp;
                 }

            }

        }



    }



}
