package com.tester.learn.books.javastructure.CH07.CH07_02;

import java.io.IOException;

/**
 * Created by leosong on 16-6-2.
 */
public class CH07_02 {

    public static void main(String args[]) throws IOException
    {
        int arr[][]=new int[5][5];
        int i,j,tmpi,tmpj;
        int [][] data={{1,2},{2,1},{2,3},{2,4},{4,3}};
        for (i=0;i<5;i++)
        {
            for (j=0;j<5;j++)
            {
                arr[i][j]=0;
            }
        }


        for (i=0;i<5;i++)
            for (j=0;j<5;j++)
            {
                tmpi=data[i][0];
                tmpj=data[i][1];
                arr[tmpi][tmpj]=1;
            }



                for(i=1;i<5;i++)
        {
            for(j=1;j<5;j++)
            {
                System.out.print("["+arr[i][j]+"] ");
                System.out.print("\n");
            }
        }


    }


}
