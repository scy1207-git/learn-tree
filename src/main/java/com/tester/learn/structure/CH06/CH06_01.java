package com.tester.learn.structure.CH06;

/**
 * Created by U0138272 on 1/1/2016.
 */
public class CH06_01 {

    public static void main(String args[]) throws Exception
    {
        int i,level;
        int data[] = {6,3,5,9,7,8,4,2};
        int btree[] = new int[16];
        for(i=0;i<16;i++) btree[i] = 0;
        System.out.println("Original data: \n");
        for(i=0;i<8;i++)
        System.out.println("[" + data[i] + "] ");

        for(i=0;i<8;i++)
        {
            for(level=1;btree[level]!=0;)
            {
                if(data[i] > btree[level]) level = level*2+1;
                else level = level*2;
            }

            btree[level] = data[i];
        }

        System.out.println("btree content:");

        for(i=1;i<16;i++)
        {
            System.out.println("["+ btree[i] + "]");
        }
        System.out.println("\n");


    }


}
