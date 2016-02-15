package com.tester.learn.books.effectivejava.CH04.item20.hierarchy;

/**
 * Created by leosong on 16-2-15.
 */
public class Rectangle extends Figure {

    final double length;
    final double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        return length * width;
    }

}
