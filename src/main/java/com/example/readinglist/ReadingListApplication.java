package com.example.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// enable component-scanning and auto-configuration
@SpringBootApplication
public class ReadingListApplication {

public static void main(String[] args) {
    // bootstrap application
    SpringApplication.run(ReadingListApplication.class, args);
  }
}
