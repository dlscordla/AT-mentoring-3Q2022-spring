package com.epam.automation.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootDemoApplication {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		// Access "localhost:8080" in the browser to verify if the message appears
		SpringApplication.run(SpringBootDemoApplication.class, args);

		// Prints a message to the console
		showMessageViaBeansXmlConfigScalableWay();
	}

	public static void showMessageViaBeansXmlConfigScalableWay() {
		createContext();
		helloWorld().getMessage();
	}

	private static void createContext() {
		context = new ClassPathXmlApplicationContext("Beans.xml");
	}

	private static HelloWorld helloWorld() {
		return context.getBean(HelloWorld.class);
	}
}
