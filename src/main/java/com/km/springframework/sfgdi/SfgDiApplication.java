package com.km.springframework.sfgdi;

import com.km.springframework.sfgdi.controllers.ConstructorInjectedController;
import com.km.springframework.sfgdi.controllers.MyController;
import com.km.springframework.sfgdi.controllers.PropertyInjectedController;
import com.km.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
		MyController myController= (MyController) ctx.getBean("myController");

		System.out.println("------- Primary ");

		System.out.println(myController.sayHello());


		System.out.println("------- Proparty ");

		PropertyInjectedController propertyInjectedController= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------- Setters ");

		SetterInjectedController setterInjectedController= (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());


		System.out.println("------- Constuctor ");

		ConstructorInjectedController constructorInjectedController= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}

}
