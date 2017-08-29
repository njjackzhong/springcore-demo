package com.efo.drawing;

import java.util.List;

public class Quad implements  Shape {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quad{" +
                "points=" + points +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("Quad drawn:"+getPoints());
    }
}
