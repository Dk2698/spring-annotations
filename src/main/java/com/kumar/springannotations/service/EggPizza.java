package com.kumar.springannotations.service;

public class EggPizza implements  Pizza{
    @Override
    public String getPizza() {
        return "Egg Pizza !";
    }
}
