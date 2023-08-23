package com.brkbthn;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Merkez {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("camelContext.xml");
		Ogrenci ogrenci = (Ogrenci)context.getBean("ogrenci");
		System.out.println("adi: "+ogrenci.getAdi()+
				" soyadi: "+ogrenci.getSoyadi()+
				" numarasi "+ ogrenci.getNumarasi()+
				" universitesi: "+ ogrenci.getUniversitesi());
	}

}
