package com.tester.learn.books.javabasiccoder.CH10;

import java.util.Arrays;

/**
 * Created by leosong on 16-7-11.
 */
public class SequenceQueue<T> {

    private int DEFAULT_SIZE =10;
    private int capacity;
    private Object[] elementData;

    private int front = 0;
    private int rear = 0;

    public SequenceQueue()
    {
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }

    public SequenceQueue(T element)
    {
        this();
        elementData[0] = element;
        rear++;
    }

    public SequenceQueue(T element, int initSize)
    {
        this.capacity = initSize;
        elementData =new Object[capacity];
        elementData[0] = element;
        rear++;
    }

    public int length()
    {
        return rear - front;
    }

    public void add(T element)
    {
        if (rear > capacity -1)
        {
            throw new IndexOutOfBoundsException("queue has been full!");
        }
        elementData[rear++] = element;
    }

    public boolean empty(){
        return rear == front;
    }

    @SuppressWarnings("unchecked")
    public T remove()
    {
        if (empty())
        {
            throw new IndexOutOfBoundsException("empty queue");
        }
        T oldValue = (T) elementData[front];
        elementData[front++] = null;
        return oldValue;
    }

    @SuppressWarnings("unchecked")
    public T element()
    {
        if (empty())
        {
            throw new IndexOutOfBoundsException("empty eqeue exception");
        }
        return (T)elementData[front];
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
        {return "[]";}
        else
        {
            StringBuilder sb = new StringBuilder("[");
            for(int i = front;i< rear; i++)
            {
                sb.append(elementData[i].toString()+ ", ");

            }
            int len = sb.length();
            return sb.delete(len -2,len).append("]").toString();
        }
    }



}
