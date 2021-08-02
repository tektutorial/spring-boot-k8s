package com.java.spring.kubernetes.demo;

public class Person {
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
