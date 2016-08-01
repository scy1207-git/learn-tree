package com.tester.learn.books.zen.CH15.CH01;

/**
 * Created by leosong on 16-8-1.
 */
public class Invoker {

    private Command command;
    public void setCOmmand(Command command)
    {
        this.command = command;
    }

    public void action()
    {
        this.command.execute();
    }


}
