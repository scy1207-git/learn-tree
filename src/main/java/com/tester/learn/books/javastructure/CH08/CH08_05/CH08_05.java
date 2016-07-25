package com.tester.learn.books.javastructure.CH08.CH08_05;

/**
 * Created by leosong on 16/7/23.
 */
public class CH08_05 {

    public static void main(String[] args) {
        int a[] = {9, 3, 5, 7};
        int size = a.length;
        int i;
        int j;
        int k = 1;
        int tmp;
        int jmp;
        jmp = a.length / 2;
        System.out.println("jmp before: " +jmp);

        while (jmp!=0)
        {
            for(i = jmp;i<size; i++)
            {
                tmp = a[jmp];
                j = i-jmp;
                while(j>=0&&tmp<a[j])
                {
                    a[j+jmp] = a[j];
                    j = j - jmp;

                }
                a[jmp+j] = tmp;
            }

            jmp = jmp/2;
            System.out.println("jmp: "+ jmp);
        }


    }


}
