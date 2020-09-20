package com.km.springframework.sfgdi;

import com.km.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(SfgDiApplication.class, args);
		MyController myController= (MyController) ctx.getBean("myController");

		System.out.println(myController.sayHello());
	}

}
