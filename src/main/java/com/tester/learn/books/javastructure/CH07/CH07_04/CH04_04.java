package com.tester.learn.books.javastructure.CH07.CH07_04;

/**
 * Created by leosong on 16-6-2.
 */

class Node{
    int x;
    Node next;

    public Node(int _x)
    {
        this.x = x;
        this.next = null;
    }

}

class GraphLink
{
    public Node first;
    public Node last;

    public boolean isEmpty()
    {
        return first==null;
    }

    public void print()
    {
        Node current=first;
        while(current!=null)
        {
            System.out.print("["+current.x+"]");
            current=current.next;

        }
        System.out.println();
    }
    public void insert(int x)
    {
        Node newNode=new Node(x);
        if(this.isEmpty())
        {
            first=newNode;
            last=newNode;
        }
        else
        {
            last.next=newNode;
            last=newNode;
        }
    }




}



public class CH04_04 {
    public static int run[]=new int[9];
    public static GraphLink Head[]=new GraphLink[9];

    public static void dfs(int current)
    {
        run[current] = 1;
        System.out.print("["+current+"]");
        while(Head[current].first!=null)
        {
            if(run[Head[current].first.x]==0)
            {
                dfs(Head[current].first.x);
                Head[current].first=Head[current].first.next;
            }
        }
    }

    public static void main(String args[]) {
        int Data[][] = {
                {1, 2}, {2, 1}, {1, 3}, {3, 1}, {2, 4}, {4, 2}, {2, 5}, {5, 2}, {3, 6}, {6, 3},
                {3, 7}, {7, 3}, {4, 5}, {5, 4}, {6, 7}, {7, 6}, {5, 8}, {8, 5}, {6, 8}, {8, 6}};

        int DataNum;
        int i,j;
        System.out.println("=======print table=======");
        for ( i=1 ; i<9 ; i++ )
        {
            run[i]=0;
            System.out.println(run[i]);
            Head[i]=new GraphLink();
            System.out.print("顶点"+i+"=>");
            for( j=0 ; j<20 ;j++)
            {
                System.out.println("Data["+j+"][0]==" + Data[j][0]);
                if(Data[j][0]==i)
                {
                    DataNum = Data[j][1];

                }
            }

        }


    }


}
