package com.kumar.springannotations.config;

import com.kumar.springannotations.controller.PizzaController;
import com.kumar.springannotations.service.CheesePizza;
import com.kumar.springannotations.service.EggPizza;
import com.kumar.springannotations.service.NonVegPizza;
import com.kumar.springannotations.service.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "cheesePizzaBean") // tells to ioc manage this bean here tells to ioc
    public Pizza cheesePizza(){
        return new CheesePizza(); // return object of CheesePizza class
    }

    @Bean
    public Pizza eggPizza(){
        return  new EggPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(cheesePizza());
    }
}
