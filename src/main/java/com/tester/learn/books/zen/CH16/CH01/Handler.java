package com.tester.learn.books.zen.CH16.CH01;

/**
 * Created by leosong on 16-8-1.
 */
public abstract class Handler {
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST =2;
    public final static int SON_LEVEL_REQUEST =3;
    private int level = 0;

    private Handler nextHandler;
    public Handler(int _level)
    {
        this.level = _level;
    }

    public final void HandleMessage(IWomen women)
    {
        if (women.getType() == this.level)
        {
            this.response(women);
        }else
        {
            if(this.nextHandler != null)
            {
                this.nextHandler.HandleMessage(women);
            }else
            {
                System.out.println("no one can deal with this, cannot degree");
            }
        }
    }


    public void setNext(Handler _handler)
    {
        this.nextHandler = _handler;
    }

    protected abstract void response(IWomen women);

}
