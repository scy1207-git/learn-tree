package com.tester.learn.books.javastructure.CH07.CH07_05;

/**
 * Created by leosong on 16-6-10.
 */

class Node {
    int x;
    Node next;
    public Node(int x) {
        this.x=x;
        this.next=null;
    }
}

class GraphLink{
    public Node first;
    public Node last;
    public boolean isEmpty()
    {
        return first==null;
    }

    public void print()
    {
        Node current = first;
        while(current!=null)
        {
            System.out.print("["+current.x+"]");
            current = current.next;
        }
        System.out.println();
    }

    public void insert(int x)
    {
        Node newNode = new Node(x);
        if(this.isEmpty())
        {
            first = newNode;
            last = newNode;
        }else
        {
            last.next = newNode;
            last = newNode;
        }
    }



   }


public class CH07_05 {

    public static int run[]=new int[9];//用来记录各顶点是否遍历过
    public static GraphLink Head[]=new GraphLink[9];
    public final static int MAXSIZE=10; //定义队列的最大容量
    static int[] queue= new int[MAXSIZE];//队列数组的声明
    static int front=-1; //指向队列的前端
    static int rear=-1; //指向队列的后端

    public static void enqueue(int value)
    {
        if (rear >= MAXSIZE) return;
        rear++;
        queue[rear] = value;
    }

    public static int dequeue()
    {
        if (front ==rear) return -1;
        front++;
        return queue[front];
    }

    public static void bfs(int current)
    {
        Node tempnode; //临时的节点指针
        enqueue(current); //将第一个顶点存入队列
        run[current]=1; //将遍历过的顶点设定为1
        System.out.print("["+current+"]");
        while(front!=rear)//判断目前是否为空队列
        {
            current=dequeue(); //将顶点从队列中取出
            tempnode=Head[current].first; //先记录目前顶点的位置
            while(tempnode!=null) {
                if(run[tempnode.x]==0) {
                            enqueue(tempnode.x);
                            run[tempnode.x]=1; //记录已遍历过
                              System.out.print("["+tempnode.x+"]");
                    }
                tempnode=tempnode.next;
                }
            }



        }



    }




