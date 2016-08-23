package com.tester.learn.lu.leetcode.easy.minstack;

import java.util.Stack;

/**
 * Created by leosong on 16-8-19.
 */
public class Solution {

    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();


    public void push(int x) {
        this.stack.push(x);
        if(this.minStack.isEmpty())
        {
            this.minStack.push(x);
        }else
        {
            if(x == this.minStack.peek())
            {
                this.minStack.push(x);
            }
        }

    }

    public void pop() {
        int n =this.stack.pop();
        if(n <= this.minStack.peek())
        {
            this.minStack.peek();
        }

    }

    public int top() {
        return this.minStack.peek();

    }

    public int getMin() {

        assert this.minStack.isEmpty();
        return this.minStack.peek();

    }


}
