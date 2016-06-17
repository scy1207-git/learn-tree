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


        System.out.print("原始数据为：");
        for(i=0;i<6;i++)
        {
            System.out.print(data[i]+" ");
        }
        System.out.print("\n");

        for (i=5;i>0;i--)		//扫描次数
        {
            for (j=0;j<i;j++)   	//比较、交换次数
            {
                if (data[j]>data[j+1])
                {
                    tmp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                }
            }
            //把各次扫描后的结果打印�X
            System.out.print("第"+(6-i)+"次排序后的结果是：");
            for (j=0;j<6;j++)
            {
                System.out.print(data[j]+" ");
            }
            System.out.print("\n");

        }

        System.out.print("排序后结果为：");
        for (i=0;i<6;i++)
        {
            System.out.print(data[i]+" ");
        }

    }
}
