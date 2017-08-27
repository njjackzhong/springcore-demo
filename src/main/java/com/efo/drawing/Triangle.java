package com.efo.drawing;

import javax.annotation.PreDestroy;

public class Triangle implements Shape{
    private String type;
    private int height;
    private Point pointA;
    private Point pointB;
    private Point pointC;



    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){
        System.out.println(" Triangle Drawn:" + this);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "type='" + type + '\'' +
                ", height=" + height +
                ", pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Destroy Triangle");
    }
}
