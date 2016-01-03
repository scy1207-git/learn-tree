package com.tester.learn.structure.CH0607;

import java.io.*;

class ThreadNode{
    int value;
    int left_Thread;
    int right_Thread;
    ThreadNode left_Node;
    ThreadNode right_Node;

    public ThreadNode(int value){
        this.value = value;
        this.left_Thread = 0;
        this.right_Thread = 0;
        this.left_Node =null;
        this.right_Node = null;
    }
}

class Threaded_Binary_Tree {
    public ThreadNode rootNode;

    public Threaded_Binary_Tree(){
        rootNode = null;
    }

    public Threaded_Binary_Tree(int data[]){
        for(int i=0;i<data.length;i++)
        {
            Add_Node_To_Tree(data[i]);
        }
    }

    void Add_Node_To_Tree(int value){
        ThreadNode newnode = new ThreadNode(value);
        ThreadNode current;
        ThreadNode parent;
        ThreadNode previous = new ThreadNode(value);
        int pos;

        if(rootNode ==null)
        {
            rootNode = newnode;
            rootNode.left_Node = rootNode;
            rootNode.right_Node = null;
            rootNode.left_Thread = 0;
            rootNode.right_Thread = 1;
            return;
        }

        current =rootNode.right_Node;
        if(current == null)
        {
            rootNode.right_Node = newnode;
            newnode.left_Node = rootNode;
            newnode.right_Node = rootNode;
            return;
        }

        parent = rootNode;
        pos = 0;

        while(current!=null)
        {
            if(current.value > value)
            {
                if(pos!=-1)
                {
                    pos = -1;
                    previous = parent;
                }

                parent = current;
                if(current.left_Thread == 1)
                {
                    current = current.left_Node;
                }else current = null;
            }else
            {
                if(pos!=1)
                {
                    pos =1;
                    previous = parent;
                }
                parent = current;
                if(current.right_Thread == 1)
                    current = current.right_Node;
                else current = null;
            }
        }

        if (parent.value > value)
        {
            parent.left_Thread = 1;
            parent.left_Node = newnode;
            newnode.left_Node = previous;
            newnode.right_Node = parent;
        }else
        {
            parent.right_Thread = 1;
            parent.right_Node = newnode;
            newnode.left_Node = parent;
            newnode.right_Node = previous;
        }
        return;
    }

    void print()
    {
        ThreadNode tempNode;
        tempNode = rootNode;
        do
        {
         if(tempNode.right_Thread == 0)
         {
             tempNode = tempNode.right_Node;
         }else
         {
             tempNode = tempNode.right_Node;
             while (tempNode.left_Thread !=0)
                 tempNode = tempNode.left_Node;
         }

         if (tempNode != rootNode)
             System.out.println("{" + tempNode.value + "]");

        } while (tempNode != rootNode);
    }

}

/**
 * Created by U0138272 on 1/3/2016.
 */
public class CH06_07 {

    public static void main(String args[]) throws IOException
    {
        System.out.print("xxx");
        int[] data1 = {0,10,20,30,100,399,453,43,237,373,655};
        Threaded_Binary_Tree tree1 =new Threaded_Binary_Tree(data1);
        tree1.print();

    }

}
