package com.tester.learn.books.javastructure.CH08.CH08_01;

/**
 * Created by U0138272 on 6/11/2016.
 */
public class CH08_01 {

    public static void main(String args[])
    {
        int i,j,tmp;
        int data[]={6,5,9,7,2,8};	//原始数据

        System.out.println("冒泡排序法：");


        System.out.print("原始数据为：\t\n");
        for( i = data.length -1;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                if(data[j] > data[j+1])
                {
                    tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                 }

            }
        }
        System.out.println("\n");







        System.out.println("排序后结果为：");
        for (i=0;i<6;i++)
        {
            System.out.print(data[i]+" ");
        }

    }
}
