package com.tester.learn.books.zen.CH17.CH17_01;

/**
 * Created by U0138272 on 6/19/2016.
 */
public class FouthGradeSchoolReport  extends SchoolReport{

    public void report()
    {
        System.out.println("尊敬的XXX家长:");
        System.out.println("  ......");
        System.out.println("  语文 62  数学65 体育 98  自然  63");
        System.out.println("  .......");
        System.out.println("               家长签名：       ");

    }


    public void sign(String _name)
    {
        System.out.println("家长签名为："+_name);
    }
}
