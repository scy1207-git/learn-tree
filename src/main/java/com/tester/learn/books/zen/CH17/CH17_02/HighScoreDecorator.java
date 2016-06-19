package com.tester.learn.books.zen.CH17.CH17_02;

/**
 * Created by U0138272 on 6/19/2016.
 */
public class HighScoreDecorator extends Decorator{

    public HighScoreDecorator(SchoolReport _sr)
    {
        super(_sr);
    }

    private void reportHighScore()
    {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void report()
    {
        this.reportHighScore();
        super.report();
    }



}
