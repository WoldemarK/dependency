package com.example.depend;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
public class CarWithConstructor {
    private Logger logger;
    private final Engine engine;

    @Autowired(required = false)
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void save() {
        if (logger != null)
            logger.log("logged");
        System.out.println("save method");
    }
}
