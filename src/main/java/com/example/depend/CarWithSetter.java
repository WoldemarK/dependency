package com.example.depend;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class CarWithSetter {
    private Logger logger;
    private Engine engine;

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
