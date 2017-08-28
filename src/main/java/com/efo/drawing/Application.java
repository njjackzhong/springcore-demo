package com.efo.drawing;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        long startTick = new Date().getTime();


        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        context.registerShutdownHook();
        Triangle triangle = context.getBean("triangle-name", Triangle.class);               //get first level bean
        triangle.draw();

        triangle.setHeight(triangle.getHeight() + 1);
        triangle = context.getBean("triangle-name", Triangle.class);               //get first level bean
        triangle.draw();



        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Quad quad = applicationContext.getBean("quad", Quad.class);
        System.out.println("Quad is:" + quad);
        applicationContext.destroy();

        long endTick = new Date().getTime();


        System.out.println(String.format("Time used:%5s ms", endTick - startTick));

    }
}
