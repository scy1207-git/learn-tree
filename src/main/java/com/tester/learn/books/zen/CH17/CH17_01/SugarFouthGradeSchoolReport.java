package com.tester.learn.books.zen.CH17.CH17_01;

/**
 * Created by leosong on 16-8-2.
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {

    private void reportHighScore()
    {
        System.out.println("this time yuwen highest 75,math 78,nature 80");
    }

    private void reportSort()
    {
        System.out.println("pai ming 38");
    }

    @Override
    public void report()
    {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }


}
