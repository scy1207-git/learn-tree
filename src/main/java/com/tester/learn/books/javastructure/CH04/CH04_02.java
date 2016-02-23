package com.tester.learn.books.javastructure.CH04;

import java.io.*;
/**
 * Created by leosong on 16-2-19.
 */


public class CH04_02 {

    static int top =-1;
    public static void main(String args[]) throws IOException
    {

        int card[] = new int[52];
        int stack[] = new int[52];
        int i,j,k =0,test;
        char ascVal = 'H';
        int style;
        for(i=0;i<52;i++) card[i] = i;

        System.out.println("xi pai zhong...");

        while(k<30)
        {
            for(i = 0;i<51;i++)
            {
                for(j = i+1;j<52;j++)
                {
                    if(((int)(Math.random()*5)) ==2)
                    {
                        test = card[i];
                        card[i] = card[j];
                        card[j] = test;
                    }
                }
            }
            k++;
        }

        i = 0;
        while (i != 52)
        {
            push(stack,52,card[i]);  //push 52 cards into cards
            i++;
        }
        System.out.println("anticlockwise sending");
        System.out.println("show players: East\t  North\t West\t  South\t");
        System.out.println("=====================");

        while (top >= 0)
        {
            style = stack[top];
            switch(style)
            {
                case 0:
                    ascVal = 'C';
                    break;
                case 1:
                    ascVal = 'D';
                    break;
                case 2:
                    ascVal = 'H';
                    break;
                case 3:
                    ascVal = 'S';
                    break;
            }
            System.out.println("{" + ascVal + (stack[top]%13+1)+"]");
            System.out.println('\t');

            if(top%4 ==0)
            {
                System.out.println();
            }
            top--;

        }

    }

    public static void push(int stack[],int MAX,int val)
    {
        if(top>=MAX-1)
        {
            System.out.println("[stack is full]");
        }else
        {
            top++;
            stack[top] = val;
        }
    }

    public static int pop(int stack[])
    {
        if(top<0)
        {
            System.out.println("stack is empty");
        }else
        {
            top--;
        }
        return stack[top];
    }





}
