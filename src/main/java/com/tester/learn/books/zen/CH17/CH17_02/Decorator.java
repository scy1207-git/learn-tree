package com.tester.learn.books.zen.CH17.CH17_02;

/**
 * Created by U0138272 on 6/19/2016.
 */
public abstract class Decorator  extends SchoolReport{

    private SchoolReport sr;

    public Decorator(SchoolReport _sr){
        this.sr = _sr;
    }

    public void report()
    {
        this.sr.report();
    }

    public void sign(String _name)
    {
        this.sr.sign(_name);
    }

}
