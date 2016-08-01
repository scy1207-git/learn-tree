package com.tester.learn.books.zen.CH15.CH01;

/**
 * Created by leosong on 16-8-1.
 */
public class DeletePageCommand extends Command {

    public void execute()
    {
        super.pg.find();
        super.rg.delete();
        super.rg.plan();

    }

}
