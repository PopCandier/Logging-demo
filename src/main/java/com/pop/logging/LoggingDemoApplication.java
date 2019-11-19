package com.pop.logging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class LoggingDemoApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(LoggingDemoApplication.class, args);
        System.in.read();
    }

}
