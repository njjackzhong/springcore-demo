package com.efo.employee;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        //Object Construction  | Done by developer
//        Employee employee = new Employee("Jack Lee", "M", "100");
//        System.out.println("Employee Details: " + employee);

        //Spring way | IOC
        //Deprecated
//        Resource resource = new ClassPathResource("spring-beans.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);


        AbstractApplicationContext factory = new ClassPathXmlApplicationContext("spring-beans.xml");   //AbstractApplicationContext Implements BeanFactory which shall parse xml and construct Bean
        Employee emp1 = factory.getBean("emp1", Employee.class);
//        Employee emp2 = factory.getBean("emp2", Employee.class);
//
        System.out.println("Employee1 Details:" + emp1);

        factory.destroy();
//        System.out.println("Employee2 Details:" + emp2);
    }
}
