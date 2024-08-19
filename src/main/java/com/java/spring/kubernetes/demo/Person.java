package com.java.spring.kubernetes.demo;

import org.springframework.boot.autoconfigure.gson.GsonProperties;

public class Person {

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    Car car ;


    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    private String name;
    private String age;

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
