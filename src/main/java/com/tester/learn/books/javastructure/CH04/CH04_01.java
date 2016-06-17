package com.tester.learn.books.javastructure.CH04;


import java.io.*;

/**
 * Created by leosong on 16-2-19.
 */
    class StackByArray{
        private int[] stack;
        private int top;

        public StackByArray(int stack_size)
        {
            stack = new int[stack_size];
            top = -1;

        }

        public boolean push(int data){
            if(top >= stack.length)
            {
                System.out.println("stack is full");
                return false;
            }else
            {
                stack[++top] = data;
                return true;
            }

        }

        public boolean empty(){

            if (top == 1) return true;
            else return false;

        }

        public int pop(){
            if(empty()) return -1;
            else return stack[top--];
        }

    }

public class CH04_01 {

    public static void main(String args[]) throws IOException
    {

        BufferedReader buf;
        int value;
        StackByArray stack = new StackByArray(10);
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input ten numbers: ");
        for (int i=0;i<10;i++)
        {
            value = Integer.parseInt(buf.readLine());
            stack.push(value);

        }

        System.out.println("============================");

        while (!stack.empty())
        {
            System.out.println("push order:" + stack.pop());
        }



    }



}
