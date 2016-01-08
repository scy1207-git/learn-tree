package com.tester.learn.books.crazyjava;

/**
 * Created by leosong on 16-1-8.
 */
public class ObjectArrayTest {

    public static void main(String[] args)
    {

        Object[] objArr = new Object[3];
        objArr[1] = new Object[2];

        Object[] objArr2 = (Object[])objArr[1];

        objArr2[1] = new Object[3];

        Object[] objArr3 = (Object[])objArr2[1];

        objArr3[1] = new int[5];

        int[] iArr = (int[])objArr3[1];




    }



}
