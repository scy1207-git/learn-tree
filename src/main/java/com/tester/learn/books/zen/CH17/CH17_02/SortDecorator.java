package com.tester.learn.books.zen.CH17.CH17_02;

/**
 * Created by U0138272 on 6/19/2016.
 */
public class SortDecorator extends Decorator{

    public SortDecorator(SchoolReport sr)
    {
        super(sr);
    }

    private void reportSort()
    {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report()
    {
        super.report();
        this.reportSort();
    }

}
