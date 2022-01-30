package com.example.demo.kafkaproducer.dao;

public class Book {
    private String name;
    private String year;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }
}
