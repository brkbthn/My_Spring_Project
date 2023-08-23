package com.brkbthn.matematik;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;
@Component("hesapMakinesi")
public class HesapMakinesi {
	@Autowired //setter metptun içerisinde de kullanılabilir
	Islem islem; //enjekte et
	
	public HesapMakinesi() {
		// TODO Auto-generated constructor stub
		System.out.println("hesap makinası calistirildi");
	}

	public Islem getIslem() {
		return islem;
	}

	public void setIslem(Islem islem) {
		this.islem = islem;
	}
	public void sonuc(int sayi1, int sayi2) {
		System.out.println("Topla: " + islem.topla(sayi1, sayi2));
		System.out.println("Cikar: " + islem.cikar(sayi1, sayi2));
		System.out.println("caarp: " + islem.carp(sayi1, sayi2));
		System.out.println("bol: "+ islem.bol(sayi1, sayi2));
		
	}


	
	
	
}
