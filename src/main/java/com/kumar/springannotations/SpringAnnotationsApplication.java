package com.kumar.springannotations;

import com.kumar.springannotations.controller.MyController;
import com.kumar.springannotations.controller.PizzaController;
import com.kumar.springannotations.lazy.LazyLoader;
import com.kumar.springannotations.repository.MyRepository;
import com.kumar.springannotations.scope.PrototypeBean;
import com.kumar.springannotations.scope.SingletonBean;
import com.kumar.springannotations.service.CheesePizza;
import com.kumar.springannotations.service.MyService;
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

		MyController myController = context.getBean(MyController.class);
		System.out.println(myController.hello());

		MyService myService = context.getBean(MyService.class);
		System.out.println(myService.hello());

		MyRepository repository = context.getBean(MyRepository.class);
		System.out.println(repository.hello());

		// lazy loader
		LazyLoader lazyLoader = context.getBean(LazyLoader.class);

		// scope
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean1.hashCode());
		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean2.hashCode());
		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
		System.out.println(singletonBean3.hashCode());

		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.hashCode());
		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.hashCode());
		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
		System.out.println(prototypeBean3.hashCode());



	}

}
