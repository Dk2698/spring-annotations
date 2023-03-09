package com.kumar.springannotations;

import com.kumar.springannotations.controller.PizzaController;
import com.kumar.springannotations.service.CheesePizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
		// get bean from spring ioc
		// springioc to create bean and here to get object or beans
//		PizzaController pizzaController = context.getBean(PizzaController.class);
//		System.out.println(pizzaController.getPizza());

//		PizzaController pizzaController1 = (PizzaController) context.getBean("pizzaDemo");
//		System.out.println(pizzaController1.getPizza());
		// retrieve from bean through configuration  file
//		CheesePizza cheesePizza = context.getBean(CheesePizza.class);
//		System.out.println(cheesePizza.getPizza());

		PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
		System.out.println(pizzaController.getPizza());
	}

}
