package com.tester.learn.books.crazyjava.CH15;

/**
 * Created by leosong on 16-1-29.
 */
public class Person implements java.io.Serializable{

    private String name;
    private int age;

    public Person(String name,int age){
        System.out.println("structure with parma");
        this.name = name;
        this.age = age;
    }

}
