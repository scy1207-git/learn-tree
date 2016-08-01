package com.tester.learn.books.zen.CH15.CH01;

/**
 * Created by leosong on 16-8-1.
 */
public abstract class Command {

    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();

}
