package com.tester.learn.books.zen.CH17.CH17_01;

/**
 * Created by leosong on 16-8-2.
 */
public abstract class Decorator extends SchoolReport {

    private SchoolReport sr;

    public Decorator(SchoolReport sr)
    {
        this.sr = sr;
    }

    public void report()
    {
        this.sr.report();
    }

    public void sign(String name)
    {
        this.sr.sign(name);
    }


}
