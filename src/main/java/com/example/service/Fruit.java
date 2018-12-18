package com.example.service;

// Model class - forms the basis of the domain
// Spring MVC models are POJOs

public class Fruit {

    private String name;

    public Fruit() {
    }

    public Fruit( String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
