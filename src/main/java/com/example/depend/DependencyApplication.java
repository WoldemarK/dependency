package com.example.depend;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyApplication {

    public static void main(String[] args) {
        ApplicationContext xmlConfigContext =
                new ClassPathXmlApplicationContext("depend.xml");
    }

}
