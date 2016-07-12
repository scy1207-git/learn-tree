package com.tester.learn.books.javabasiccoder.CH10;

/**
 * Created by dingshan on 16/7/12.
 */
public class SequenceQueueTest {

    public static void main(String[] args)
    {
        SequenceQueue<String> queue = new SequenceQueue<String>();
        queue.add("aaaaa");
        queue.add("bbbbb");
        queue.add("ccccc");
        queue.add("ddddd");
        System.out.println(queue);
        System.out.println("visit queue front element: " + queue.element()) ;
        System.out.println("remove queue front element: " + queue.remove());
        System.out.println("after remove queue: " + queue);


    }

}
