package com.brkbthn;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Merkez {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("camelContext.xml");
		

		Ogrenci ogrenci = context.getBean("ogrenci", Ogrenci.class);
		
		ogrenci.getOgrenciList();
		ogrenci.getOgrenciSet();
		ogrenci.getOgrenciMap();
		ogrenci.getOgrenciProperties();
		

}
}