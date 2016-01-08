package com.tester.learn.books.crazyjava;

/**
 * Created by leosong on 16-1-8.
 */

class Person{
    public int age;
    public double height;
    public void info()
    {
        System.out.println("Age =" + age + " height= " + height);
    }
}


public class ReferenceArrayTest {

    public static void main(String[] args)
    {
        Person[] students;
        students = new Person[2];

        System.out.println("students' length: " + students.length);

        Person zhang = new Person();
        zhang.age = 15;
        zhang.height = 158;

        Person lee = new Person();
        lee.age = 16;
        lee.height = 180;

        students[0] = zhang;
        students[1] = lee;

        lee.info();
        students[1].info();


    }

}
