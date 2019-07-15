package com.tws.refactoring;

public class Driver {

    private static final int LEGAL_AGE = 18;
    private int age;

    public Driver() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Driver(int age) {
        this.age = age;
    }

    public boolean isLegalDriver() {
        return this.age >= LEGAL_AGE;
    }
}
