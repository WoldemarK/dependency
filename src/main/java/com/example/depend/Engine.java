package com.example.depend;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class Engine {
    private Long id;
    private double beat;
    private String name;

    public Engine(Long id, double beat, String name) {
        this.id = id;
        this.beat = beat;
        this.name = name;
    }

    public Engine() {
    }
}
