package com.java.spring.kubernetes.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringBootK8sApplication {

    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(SpringBootK8sApplication.class, args);
    }

    @GetMapping("/push")
    public String sayHello() {
        return "Hello From Spring and Kuberneted example";
    }

    @GetMapping("/hello")
    public String sayHello1(@RequestHeader Map<String, String> headers,
                            HttpServletResponse response) {
       //response.addHeader("x-header", headers.get("x-header"));
        return "Hello From Spring and Kuberneted example-with V8";
    }

    @GetMapping("/add")
    public Integer sayHello1(@RequestParam Integer first, @RequestParam Integer second) {
        return first + second;
    }

    @PostMapping("/hello")
    public String sayHello2(@RequestBody Person person) {
        System.out.println(person.getName() + " - " + person.getAge());
        return "Hello From Spring and Kuberneted example";
    }

}
