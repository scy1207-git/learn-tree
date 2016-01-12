package com.tester.learn.books.javacoder.CH02;

/**
 * Created by leosong on 16-1-11.
 */

class Cat
{
    String name;
    int age;

    public Cat(String name, int age)
    {
        System.out.println("executing structure==");
        this.name = name;
        this.age = age;
    }

    {
        System.out.println("execte non static init");
        weight = 2.0;
    }
    double weight = 2.3;

    public String toString()
    {
        return "Cat[name=" + name +", age = " + age +"  weigh= "+ weight + "]";
    }
}

public class InitTest {

    public static void main(String[] args)
    {
        Cat cat = new Cat("kitty",2);
        System.out.println(cat);

        Cat c2 = new Cat("Garfield",3);
        System.out.println(c2);
    }
}
