package com.brkbthn;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Merkez {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("camelContext.xml");
		

		Calisan calisan = context.getBean("calisan", Calisan.class);
		System.out.println(calisan);


}
}