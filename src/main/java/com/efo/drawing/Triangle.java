package com.efo.drawing;

import javax.annotation.PreDestroy;

public class Triangle implements Shape{
    private String type;
    private int height;


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

    public void draw(){
        System.out.println(getType() + " Triangle Drawn of height " + getHeight());
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Destroy Triangle");
    }
}
