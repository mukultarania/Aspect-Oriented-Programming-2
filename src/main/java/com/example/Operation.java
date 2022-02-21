package com.example;

import org.springframework.stereotype.Component;

@Component
public class Operation {
    public void sum(int a, int b){
        System.out.println("Sum is: "+ (a+b));
    }
}
