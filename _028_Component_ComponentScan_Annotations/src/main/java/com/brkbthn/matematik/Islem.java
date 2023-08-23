package com.brkbthn.matematik;

import org.springframework.stereotype.*;

@Component("islemBeanComponent") // parantez içinde id verildi
//projede xml varken yapılandırma yapılıyorsa @Bean yerine @Component kullanılmak zorundadır
public class Islem {
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;

	}

	public int cikar(int sayi1, int sayi2) {
		return sayi1 - sayi2;

	}

	public int carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;

	}

	public double bol(int sayi1, int sayi2) {
		return sayi1 / sayi2;

	}
	

}
