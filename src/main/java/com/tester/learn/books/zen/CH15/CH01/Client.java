package com.tester.learn.books.zen.CH15.CH01;

/**
 * Created by leosong on 16-8-1.
 */
public class Client {

    public static void main(String[] args)
    {
        Invoker xiaoSan = new Invoker();
        System.out.println("cusotmer need to add a requirement:");
        Command command = new AddRequirementComand();
        xiaoSan.setCOmmand(command);
        xiaoSan.action();

    }


}
