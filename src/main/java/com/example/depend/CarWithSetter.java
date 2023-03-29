package com.example.dependency;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CarWithSetter {
    private final Engine engine;

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine){
        this.engine = engine;
    }
}
