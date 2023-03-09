package com.kumar.springannotations.controller;

import com.kumar.springannotations.service.Pizza;
import com.kumar.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("pizzaDemo")
public class PizzaController {
    // field injection
//    @Autowired
//    private VegPizza vegPizza;

    //loose coupling it's here use interface
//    @Autowired
    private Pizza pizza;

    // constructor injection
//    @Autowired
//    public PizzaController(@Qualifier("nonVegPizza") Pizza pizza) {
//        this.pizza = pizza;
//    }
        public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    // setter injection
//    @Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizza(){
        return pizza.getPizza();
    }
    public void init(){
        System.out.println("Initialization Logic");
    }
    public void destroy(){
        System.out.println("Destroy Logic");
    }
}

