package com.tester.learn.books.javabasiccoder.CH04.CH01;

import java.lang.ref.SoftReference;

/**
 * Created by leosong on 16-7-19.
 */

class Person
{
    String name;
    int age;

    public Person(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public String toString()
    {
        return "Person[name=" + name+ ", age=" + age +"]";
    }

}

public class SoftReferenceTest {

    public static void main(String[] args) throws Exception
    {
        SoftReference<Person>[] people = new SoftReference[100000];
        for(int i=0;i<people.length;i++)
        {
            people[i] =new SoftReference<Person>(new Person("name"+i,(i+1)*4%100));
        }
        System.out.println(people[2].get());
        System.out.println(people[4].get());
        System.gc();
        System.runFinalization();
    }

}
