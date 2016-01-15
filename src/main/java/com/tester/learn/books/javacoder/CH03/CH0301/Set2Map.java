package com.tester.learn.books.javacoder.CH03.CH0301;

import java.util.Map;

/**
 * Created by leosong on 16-1-15.
 */

class SimpleEntry<K,V> implements Map.Entry<K,V>,java.io.Serializable
{
    private final K key;
    private V value;

    public SimpleEntry(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    public SimpleEntry(Map.Entry<? extends K,? extends V>entry)
    {
        this.key = entry.getKey();
        this.value = entry.getValue();
    }

    public K getKey()
    {
        return key;
    }

    public V getValue()
    {
        return value;
    }

    public V setValue(V value)
    {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }
    public boolean equals(Object o)
    {
        if (o == this)
        {
            return true;
        }



    }



}






public class Set2Map {
}
