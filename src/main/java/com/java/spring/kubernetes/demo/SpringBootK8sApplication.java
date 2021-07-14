package com.java.spring.kubernetes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootK8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootK8sApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello From Spring and Kuberneted example";
    }
}
