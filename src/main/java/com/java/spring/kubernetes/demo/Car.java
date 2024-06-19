package com.java.spring.kubernetes.demo;

public enum Car {
    BREAKFAST(5), LUNCH(10), SNACKS(15), DINNER(20);

    private final int value;

    private Car(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
