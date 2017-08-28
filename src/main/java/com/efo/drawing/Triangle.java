package com.efo.drawing;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Triangle implements Shape,ApplicationContextAware,BeanNameAware,InitializingBean,DisposableBean{
    private String type;
    private int height;
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context;




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

    public void destroy(){
        System.out.println("Disposable Triangle.");
    }

    public void myInit(){
        System.out.println("MyInit Triangle.");
    }

    public void myDestroy(){
        System.out.println("MyDestroy Triangle.");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name is:"+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext is:"+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Triangle InitializingBean.");
    }
}
