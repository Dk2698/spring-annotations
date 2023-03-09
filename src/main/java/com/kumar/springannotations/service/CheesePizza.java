package com.kumar.springannotations.service;

public class CheesePizza implements  Pizza{
    @Override
    public String getPizza() {
        return "Cheese Pizza";
    }
}
