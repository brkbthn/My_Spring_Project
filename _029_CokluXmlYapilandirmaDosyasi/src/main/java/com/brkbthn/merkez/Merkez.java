package com.brkbthn.merkez;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.brkbthn.musteri.Musteri;

public class Merkez {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Musteri musteri = context.getBean("BeanMusteri", Musteri.class);
		
		System.out.println("Adı: "+musteri.getAdi());
		
	}

	

}
