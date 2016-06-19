package com.tester.learn.books.zen.CH17.CH17_02;

/**
 * Created by U0138272 on 6/19/2016.
 */
public class Father {

    public static void main(String[] args)
    {

        SchoolReport sr;
        sr = new FouthGradeSchoolReport();

        sr = new HighScoreDecorator(sr);

        sr = new SortDecorator(sr);

        sr.report();



    }

}
