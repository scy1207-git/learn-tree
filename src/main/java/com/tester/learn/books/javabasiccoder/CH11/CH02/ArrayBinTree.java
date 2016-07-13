package com.tester.learn.books.javabasiccoder.CH11.CH02;

/**
 * Created by dingshan on 16/7/13.
 */
public class ArrayBinTree<T> {

    private Object[] datas;
    private int DEFAULT_DEEP =8;

    private int deep;
    private int arraySize;

    public ArrayBinTree()
    {
        this.deep = DEFAULT_DEEP;
        this.arraySize = (int)Math.pow(2,deep) -1;
        datas = new Object[arraySize];
    }

    public ArrayBinTree(int deep)
    {
        this.deep = deep;
        this.arraySize = (int)Math.pow(2,deep) - 1;
        datas = new Object[arraySize];
    }

    public ArrayBinTree(int deep,T data)
    {
        this.deep = deep;
        this.arraySize = (int)Math.pow(2,deep) -1;
        datas[0] = data;
    }

    public void add(int index, T data, boolean left)
    {
        if(datas[index] == null)
        {
            throw new RuntimeException(index + "node is null, cannot add new node");
        }
        if(2*index +1 >= arraySize)
        {
            throw new RuntimeException("tree array is full, out of index exception");
        }
        if(left)
        {
            datas[2*index +1] =  data;
        }else
        {
            datas[2*index +2] = data;
        }
    }


    public boolean empty()
    {
        return datas[0] == null;
    }

    @SuppressWarnings("unchecked")
    public T root()
    {
        return (T)datas[0];
    }

    @SuppressWarnings("unchecked")
    public T parent(int index)
    {
        return (T) datas[(index-1)/2];
    }

    public T left(int index)
    {
        if (2*index +1 >= arraySize)
        {
            throw new RuntimeException("this node is leaf node, no sub node");
        }
        return (T) datas[index*2 +1];
    }

    @SuppressWarnings("unchecked")
    public T right(int index)
    {
        if(2 * index +1 >= arraySize)
        {
            throw new RuntimeException("this node is leaf node,no sub node");

        }
        return (T)datas[index*2 + 2];
    }

    public int deep(int index)
    {
        return deep;
    }

    public int pos(T data)
    {
        for(int i = 0; i < arraySize; i++)
        {
            if(datas[i].equals(data))
            {
                return i;
            }
        }
        return -1;
    }

    public String toString()
    {
        return java.util.Arrays.toString(datas);
    }




}
