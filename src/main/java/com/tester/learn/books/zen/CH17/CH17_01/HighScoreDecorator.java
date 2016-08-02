package com.tester.learn.books.zen.CH17.CH17_01;

/**
 * Created by leosong on 16-8-2.
 */
public class HighScoreDecorator extends Decorator {

    public HighScoreDecorator(SchoolReport sr)
    {
        super(sr);
    }

    private void reportHighScore()
    {
        System.out.println("zuigao de chengji : 87 88 89");
    }

    @Override
    public void report()
    {
        this.reportHighScore();
        super.report();
    }



}
