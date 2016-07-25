package com.tester.learn.books.zen.CH20;

/**
 * Created by leosong on 16-7-25.
 */
public class LiSi implements Observer {

    public void update(String str)
    {
        System.out.println("lisi start to see hanfeizi activity, and report to the boss!");
        this.reportToQinShiHuang(str);
        System.out.println("report is over");
    }

    private void reportToQinShiHuang(String reportContext)
    {
        System.out.println("boss, hanfeizi is doing now" + reportContext );
    }


}
