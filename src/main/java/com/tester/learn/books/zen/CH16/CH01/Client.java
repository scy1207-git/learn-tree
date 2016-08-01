package com.tester.learn.books.zen.CH16.CH01;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by leosong on 16-8-1.
 */
public class Client {

    public static void main(String[] args)
    {
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for(int i=0;i<5;i++)
        {
            arrayList.add(new Women(rand.nextInt(),"I am going out!"));
        }
        IHandler father =new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();


    }

}
