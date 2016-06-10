package com.tester.learn.books.javastructure.CH07.CH07_01;

import java.io.IOException;

/**
 * Created by leosong on 16-6-2.
 */
public class CH07_01 {

    public static void main(String args[]) throws IOException
    {
        int [][] data={
                        {1,2},{2,1},{1,5},{5,1},
                        {2,3},{3,2},{2,4},{4,2},
                        {3,4},{4,3},{3,5},{5,3},
                        {4,5},{5,4}
                      };
        int arr[][] =new int[6][6];
        int i,j,k,tmpi,tmpj;

        for (i=0;i<6;i++)
            for (j=0;j<6;j++)
                arr[i][j]=0;


        for (i=0;i<14;i++)
            for (j=0;j<6;j++)
                for (k=0;k<6;k++)
                {
                    tmpi=data[i][0];
                    tmpj=data[i][1];
                    arr[tmpi][tmpj]=1;
                }
        System.out.println("showing...");
        for(i=1;i<6;i++)
        {
            for(j=0;j<6;j++)
            {
                System.out.print("["+arr[i][j]+"] ");
                System.out.print("\n");
            }
        }





    }

}
