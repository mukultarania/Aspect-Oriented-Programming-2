package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
        Operation op = ap.getBean(Operation.class);
        op.sum(100, 50);
    }
}
