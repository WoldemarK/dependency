package com.example.dependency;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CarWithConstructor {
    private final Engine engine;

    public Engine getEngine() {
        return engine;
    }
}
