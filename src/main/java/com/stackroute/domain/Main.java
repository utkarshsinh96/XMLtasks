package com.stackroute.domain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanFile.xml");
        System.out.println("Config file loaded.");
        movie movie = context.getBean("movie1", com.stackroute.domain.movie.class);
        com.stackroute.domain.movie movie2=context.getBean("movie2", com.stackroute.domain.movie.class);
        System.out.println(movie==movie2);
        System.out.println(movie);
        System.out.println(movie2);
    }
}