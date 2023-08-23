package com.brkbthn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Ders ders = context.getBean("ders", Ders.class);
		System.out.println(ders);
		
	}

}
