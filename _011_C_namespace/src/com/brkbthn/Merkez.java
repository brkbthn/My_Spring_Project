package com.brkbthn;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Merkez {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("camelContext.xml");
		
		// Tip dönüşümü 1
		Calisan calisan1 = (Calisan) context.getBean("calisan");
		
		//Tip dönüşümü2
		Calisan calisan2 = context.getBean("calisan", Calisan.class);
		
		//Tip dönüşümü3  Bu yöntem sağlıklı bir yöntem değildir. Farklı id değerine sahip ve aynı sınıfa ait bean ler olabilir.
		Calisan calisan3 = context.getBean(Calisan.class);
		System.out.println("adi: "+calisan1.getAdi()+
				" soyadi: "+calisan1.getSoyadi()+
				" yasi: "+ calisan1.getYasi()+
				" adrsi: "+ calisan1.getAdres());
	}

}
