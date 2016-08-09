package com.tester.learn.books.zen.CH17.CH17_03;

/**
 * Created by leosong on 16-8-3.
 */
public abstract class Decorator extends Component{

    private Component component = null;

    public Decorator(Component _component)
    {
        this.component = _component;
    }

    @Override
    public void operate()
    {
        this.component.operate();
    }

}
