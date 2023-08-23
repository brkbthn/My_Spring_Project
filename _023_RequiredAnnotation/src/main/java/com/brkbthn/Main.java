package com.brkbthn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		Ogrenci ogrenci = context.getBean("ogrenci", Ogrenci.class);
		
		System.out.println(ogrenci);
		
	}

	


}
