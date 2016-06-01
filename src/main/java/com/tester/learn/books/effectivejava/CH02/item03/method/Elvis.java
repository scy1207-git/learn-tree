package com.tester.learn.books.effectivejava.CH02.item03.method;

/**
 * Created by leosong on 16-2-15.
 */
public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis(){}

    public static Elvis getInstance(){
        return INSTANCE;
    }

}
