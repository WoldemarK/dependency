package com.example.depend;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Component
@ConditionalOnExpression("${logger:true}")
public class Logger {
    public void log(String message) {
        System.out.println("log");
    }

    @Override
    public String toString() {
        return "Logger{" + Arrays.toString(getClass().getName().trim().getBytes(StandardCharsets.UTF_8)) + "}";
    }
}
