package com.efo.drawing;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        int index = 0;

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");

        while (index++ < 10) {

            //Shape    triangle = new Triangle();

            Shape triangle = context.getBean("triangle", Triangle.class);
            triangle.draw();

            System.out.println(String.format("--------index=%5s(%5s)--------", index,triangle));

            //Shape  circle = new Circle();

            //circle.draw();
        }

        context.destroy();
    }
}
