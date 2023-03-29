package com.example.depend;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DependencyApplicationTests {
    @Autowired
    private CarWithConstructor carWithConstructor;

    @Test
    void whenLogger_thenLog() {
        carWithConstructor.save();
    }

    @Test
    public void givenAnnotationConfig_whenConstructorInjected_ThenEngineExist() {
        ApplicationContext javaConfigContext =
                new AnnotationConfigApplicationContext(Config.class);

        CarWithConstructor carWithConstructor =
                javaConfigContext.getBean(CarWithConstructor.class);

        assertNotNull(carWithConstructor.getEngine());
    }

    @Test
    public void givenXmlConfig_whenConstructorInjected_ThenEngineExist() {
        ApplicationContext xmlConfigContext =
                new ClassPathXmlApplicationContext("depend.xml");

        CarWithConstructor carWithConstructor = xmlConfigContext.getBean(CarWithConstructor.class);
        assertNotNull(carWithConstructor.getEngine());
    }

    @Test
    public void givenXmlConfig_whenSetterInjected_ThenEngineExist() {
        ApplicationContext xmlConfigContext =
                new ClassPathXmlApplicationContext("depend.xml");

        CarWithSetter carWithSetter = xmlConfigContext.getBean(CarWithSetter.class);
        assertNotNull(carWithSetter.getEngine());
    }
}
