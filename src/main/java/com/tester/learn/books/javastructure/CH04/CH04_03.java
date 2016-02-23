package com.tester.learn.books.javastructure.CH04;

import java.io.*;
/**
 * Created by leosong on 16-2-23.
 */

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class StackByLink
{
    public Node front; //down node
    public Node rear;  //top node

    public boolean isEmpty()
    {
        return front == null;
    }


    public void output_of_Stack()
    {
        Node current = front;
        while(current!=null)
        {
            System.out.println("["+current.data +"]");
            current = current.next;
        }
        System.out.println();

    }

    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(this.isEmpty())
        {
            front = newNode;
            rear = newNode;
        }else
        {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void pop()
    {
        Node newNode;
        if(this.isEmpty())
        {
            System.out.println("==empty stack===");
            return;
        }
        newNode = front;
        if(newNode == rear)
        {
            front = null;
            rear = null;
            System.out.println("empty stack");
        }else
        {
            while(newNode.next!=rear)
            {
                newNode = newNode.next;
            }
            newNode.next = rear.next;
            rear = newNode;
        }

    }

}





public class CH04_03 {

    public static void main(String args[]) throws IOException
    {
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        StackByLink stack_by_linkedlist = new StackByLink();
        int choice = 0;
         while(true)
         {
             System.out.println("pop up data:");
             choice = Integer.parseInt(buf.readLine());
             if(choice ==2) {
                 stack_by_linkedlist.pop();
                 System.out.println("data out of stack");
                 stack_by_linkedlist.output_of_Stack();
             }else if(choice ==1)
             {
                 System.out.println("pls input data for stack");
                 choice = Integer.parseInt(buf.readLine());
                 stack_by_linkedlist.insert(choice);
                 System.out.println("data inserted into stack");
                 stack_by_linkedlist.output_of_Stack();
             }else if(choice == 0)
             {
                 break;
             }else
             {
                 System.out.println("typo");
             }

         }

    }


}
