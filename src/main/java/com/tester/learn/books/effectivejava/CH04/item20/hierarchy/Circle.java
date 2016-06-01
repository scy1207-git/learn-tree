package com.tester.learn.books.effectivejava.CH04.item20.hierarchy;

/**
 * Created by leosong on 16-2-15.
 */
public class Circle extends Figure{

    final double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double area(){
        return Math.PI * (radius * radius);
    }

}
