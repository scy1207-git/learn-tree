package com.tester.learn.books.zen.CH20;

import java.util.ArrayList;


/**
 * Created by leosong on 16-7-25.
 */
public class HanFeiZi implements Observable,IHanFeiZi {

    private ArrayList<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer)
    {
        this.observerList.add(observer);
    }

    public void deleteObserver(Observer observer)
    {
        this.observerList.remove(observer);
    }


    public void notifyObservers(String context)
    {
        for(Observer observer:observerList)
        {
            observer.update(context);
        }
    }

    public void haveBreadfast()
    {
        System.out.println("hanfeizi start to eat");
        this.notifyObservers("hanfeizi eating now");
    }

    public void haveFun()
    {
        System.out.println("hanfeizi start to eat");
        this.notifyObservers("hanfeizi eating now");
    }




}
