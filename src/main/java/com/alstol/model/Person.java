package com.alstol.model;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    public String name;
    public int age;
    public Person(String pName, int age) {
        this.name = pName;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + "; Age: " + this.age;
    }
}