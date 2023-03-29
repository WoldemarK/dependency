package com.example.depend;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class Engine {
    private Long id;
    private double beat;
    private String name;

}
