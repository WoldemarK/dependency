package com.example.depend;

import org.springframework.stereotype.Component;

@Component
public class Aspect {
    public void before() {
        System.out.println("Before");
    }

    public void after() {
        System.out.println("After");
    }
}
