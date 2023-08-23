package com.brkbthn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
public class SpringConfig {
	
	@Bean
	public Sehir sehir() {
		Sehir sehir = new Sehir();
		sehir.setSehirAdi("mersin");
		sehir.setPlakaNo(33);
		
		return sehir;
	}
	
	@Bean
	public Ogrenci ogrenci() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setSehir(sehir());
		return ogrenci;
	}
	
}
