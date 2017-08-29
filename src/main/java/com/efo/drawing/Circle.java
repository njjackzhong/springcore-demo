package com.efo.drawing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape {
    private Point center;

    public void draw(){
        System.out.println("Draw a com.efo.drawing.Circle, center is:"+ getCenter());
    }

    private Point getCenter() {
        return center;
    }

    @Autowired
    @Qualifier("circleCenter")
    public void setCenter(Point center) {
        this.center = center;
    }
}
