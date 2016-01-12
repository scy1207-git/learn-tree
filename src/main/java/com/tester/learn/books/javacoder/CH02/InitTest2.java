package com.tester.learn.books.javacoder.CH02;

/**
 * Created by leosong on 16-1-11.
 */

class Creature
{
    {
        System.out.println("Creature non static init");
    }
    public Creature()
    {
        System.out.println("Creature non parm structure");
    }
    public Creature(String name)
    {
        this();
        System.out.println("Creature with name:" + name);
    }

}

class Animal extends Creature
{
    {
        System.out.println("Animal non static init");
    }

    public Animal(String name)
    {
        super(name);
        System.out.println("Animal with one para structure, name= " + name);
    }

    public Animal(String name, int age)
    {
        this(name);
        System.out.println("Animal with two params , age is : " + age);
    }

}

class Wolf extends Animal
{
    {
        System.out.println("Wolf non static init");

    }

    public Wolf()
    {
        super("Hui Tai Lnag",3);
        System.out.println("Wolf non parma strucutre");
    }

    public Wolf(double weight)
    {
        this();
        System.out.println("Wolf with weight param structure" + weight);
    }



}


public class InitTest2 {
    public static void main(String[] args)
    {
        new Wolf(5.6);
    }
}
