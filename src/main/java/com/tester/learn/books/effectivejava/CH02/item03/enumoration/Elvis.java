package com.tester.learn.books.effectivejava.CH02.item03.enumoration;

/**
 * Created by leosong on 16-2-15.
 */
public enum Elvis {
    INSTANCE;

    public void leaveTheBUilding(){
        System.out.println("out of here");
    }

    public static void main(String[] args){
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBUilding();
    }


}
