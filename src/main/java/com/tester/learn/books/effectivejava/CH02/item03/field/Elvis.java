package com.tester.learn.books.effectivejava.CH02.item03.field;

/**
 * Created by leosong on 16-2-15.
 */
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis(){}

    public void leaveTheBUiding(){
        System.out.println("out");
    }

    public static void main(String[] args){
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBUiding();
    }

}
