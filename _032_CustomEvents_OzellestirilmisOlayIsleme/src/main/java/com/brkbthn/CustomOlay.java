package com.brkbthn;

import org.springframework.context.ApplicationEvent;

public class CustomOlay extends ApplicationEvent{
	

	private static final long serialVersionUID = 1L; //ust sınıfın elemanı


	public CustomOlay(Object object) {
		super(object); //hata alamamak icin üst sınıfa da gönderildi
		System.out.println("CustomOlay sınıfının kurucu metotu");
	}

	@Override
	public String toString() {
		return "CustomOlay [Ozellestirilmis olay]";
	}
}
