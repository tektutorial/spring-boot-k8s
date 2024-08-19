package com.java.spring.kubernetes.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * Docker command to run this spring boot application
 * Make image - docker build --tag spring-boot .
 * Run the container - docker run -p 8080:8085 -t spring-boot
 */

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

    @PostMapping("/push")
    public int sayHelloPost(@RequestBody Person person) {
        return person.getCar().getValue();
    }

    @GetMapping("/hello")
    public String sayHello1(@RequestHeader Map<String, String> headers,
                            HttpServletResponse response) {
        //response.addHeader("x-header", headers.get("x-header"));
        List<Integer> list = new ArrayList<>();
        list.get(list.size() - 1);
        list.add(list.get(list.size() - 1) + list.get(list.size() -2));

        return "Hello From Spring and Kuberneted example-with V9";
    }

    @GetMapping("/header")
    public String newHeader(@RequestHeader Map<String, String> headers,
                            HttpServletResponse response) {
        response.addHeader("x-header", headers.get("x-header"));
        return "Hello From Spring and Kuberneted example with new header";
    }

    @GetMapping("/add")
    public Integer sayHello1(@PathVariable Integer first, @RequestParam Integer second) {
        return first + second;
    }

    @PostMapping("/hello")
    public String sayHello2(@RequestBody Person person) {
        System.out.println(person.getName() + " - " + person.getAge());
        return "Hello From Spring and Kuberneted example";
    }

}
