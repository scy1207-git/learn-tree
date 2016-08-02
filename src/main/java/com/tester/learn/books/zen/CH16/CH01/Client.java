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
        Handler father =new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNext(husband);
        husband.setNext(son);
        for(IWomen women:arrayList)
        {
            father.HandleMessage(women);
        }


    }

}
