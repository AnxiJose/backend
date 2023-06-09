package com.flutter;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class MainApplication {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(MainApplication.class);
    app.setDefaultProperties(Collections.singletonMap("server.port", "8090"));
    app.run(args);
  }

}
