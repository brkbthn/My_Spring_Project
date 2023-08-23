package com.brkbthn;

public class Ucgen {
	
	private String cesit;
	
	/*
	 * eğer bir sınıf içerisinde default constructor metot olmadan 
	parametreli bir constructor hazırlandıysa mutlaka o parametreli
	constructor springe tanıtılmak zorundadır.
	Çünkü ıoc arka planda kurucu metotları çalıştırarak işlem yapar
	oop den de hatırlanacağı üzere developerın hiçbir metot yazmadığı 
	durumda parametresiz constructor arguman devrededir. Ancak 
	yeni bir constructor yazıldığı durumda eğer ihtiyaç varsa developer 
	parametresi yani default constructoru sınıfa eklemelidir..
    */

	
	
	public Ucgen(String cesit) {
		this.cesit = cesit;
	}


	public String getCesit() {
		return cesit;
	}


	public void setCesit(String cesit) {
		this.cesit = cesit;
	}


	public void ciz() {
		System.out.println(getCesit() + " ucgen ciz");
	}

}
