package com.tester.learn.books.javabasiccoder.CH10;


import java.util.Arrays;

/**
 * Created by dingshan on 16/7/12.
 */
public class LoopQueue<T> {

    private int DEFAULT_SIZE = 10;
    private int capacity;
    private Object[] elementData;
    private int front = 0;
    private int rear = 0;

    public LoopQueue()
    {
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }

    public LoopQueue(T element)
    {
        this();
        elementData[0] = element;
        rear++;
    }

    public LoopQueue(T element,int initSize)
    {
        this.capacity = initSize;
        elementData = new Object[capacity];
        elementData[0] = element;
        rear++;
    }

    public int length()
    {
        if(empty())
        {
            return 0;
        }
        return rear > front ? rear -front: capacity - (front - rear);
    }

    public void add(T element)
    {
        if(rear == front && elementData[front] != null)
        {
            throw new IndexOutOfBoundsException("queue full");
        }
        elementData[rear++] = element;
        rear = rear == capacity? 0:rear;
    }

    @SuppressWarnings("unchecked")
    public T remove()
    {
        if(empty())
        {
            throw new IndexOutOfBoundsException("queue full!");
        }
        T oldValue = (T)elementData[front];
        elementData[front++] = null;
        front = front == capacity? 0: front;
        return oldValue;

    }



    @SuppressWarnings("unchecked")
    public T element()
    {
        if(empty())
        {
            throw new IndexOutOfBoundsException("queue exception");
        }
        return (T)elementData[front];

    }

    public boolean empty()
    {
        return rear == front && elementData[rear] == null;
    }

    public void clear()
    {
        Arrays.fill(elementData,null);
        front = 0;
        rear = 0;
    }

    public String toString()
    {
        if(empty())
        {
            return "[]";
        }else
        {
            if(front <  rear)
            {
                StringBuilder sb = new StringBuilder("[");
                for(int i = front;i< rear ;i++)
                {
                    sb.append(elementData[i].toString() + ", ");
                }
                int len =sb.length();
                return sb.delete(len -2,len).append("]").toString();
            }else
            {
                StringBuilder sb = new StringBuilder("[");
                for(int i = front; i< capacity; i++)
                {
                    sb.append(elementData[i].toString() + ", ");
                }
                for(int i = 0;i< rear;i++)
                {
                    sb.append(elementData[i].toString() + ",");
                }
                int len = sb.length();
                //为了去掉后面的逗号
                return sb.delete(len-2,len).append("]").toString();
            }


        }



    }





}
