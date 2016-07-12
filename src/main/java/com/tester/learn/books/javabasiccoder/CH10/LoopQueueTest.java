package com.tester.learn.books.javabasiccoder.CH10;

/**
 * Created by dingshan on 16/7/12.
 */
public class LoopQueueTest {

    public static void main(String[] args)
    {
        LoopQueue<String> queue = new LoopQueue<String>("aaaa",3);
        System.out.println(queue);
        queue.add("bbbb");
        queue.add("cccc");
        System.out.println(queue);
        queue.remove();
        System.out.println("after remove");
        System.out.println(queue);
        queue.add("ddddd");
        System.out.println(queue);
        System.out.println("full queue length: " + queue.length());
        queue.remove();
        queue.add("eeee");
        System.out.println(queue);



    }


}
