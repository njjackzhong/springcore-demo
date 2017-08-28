package com.efo.drawing;

import java.util.List;

public class Quad {
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
}
