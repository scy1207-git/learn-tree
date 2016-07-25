package com.tester.learn.books.javastructure.CH08.CH08_04;

/**
 * Created by leosong on 16/7/23.
 */
public class CH08_04 {

    public static void main(String[] args)
    {
        int a[] = {1,3,6,1,7};
        int i,j,tmp;

        for(i=1;i<a.length;i++)
        {

            tmp = a[i];
            j = i -1;
            System.out.println("a[i-1]=" + a[j] + " a[i]=" + a[i]);
            while(j>=0 && tmp <a[j])
            {
                a[j+1] =a[j];
                j--;
            }
            a[j+1]=tmp;


        }


        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }

    }

}
