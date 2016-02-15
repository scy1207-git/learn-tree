package com.tester.learn.books.effectivejava.CH02.item05;

/**
 * Created by leosong on 16-2-15.
 */
public class Sum {

    public static void main(String[] args){
        Long sum = 0L;
        for(long i = 0; i < 1000;i++){
            sum += i;
        }
        System.out.println(sum);
    }

}
