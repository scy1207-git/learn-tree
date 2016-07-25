package com.tester.learn.books.zen.CH20;



/**
 * Created by leosong on 16/7/24.
 */
public interface Observable {

    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers(String context);

}
