package com.tester.learn.books.javabasiccoder.CH10;

/**
 * Created by dingshan on 16/7/11.
 */
public class SequenceStackTest {
    public static void main(String[] args)
    {
        SequenceStack<String> stack = new SequenceStack<String>();
        stack.push("aaaaa");
        stack.push("cccc");
        stack.push("dddd");
        System.out.println(stack);
        System.out.println("stack's peek: " + stack.peek());
        System.out.println("stack's push " + stack.pop());
        System.out.println("stack's push " + stack.pop());
        System.out.println("after two pop" + stack);
    }

}
