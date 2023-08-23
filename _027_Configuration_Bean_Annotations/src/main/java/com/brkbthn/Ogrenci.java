package com.brkbthn;


import org.springframework.beans.factory.annotation.*;

public class Ogrenci {
	
	private String adi, soyadi;
	
	private Sehir sehir;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public Sehir getSehir() {
		return sehir;
	}

	public void setSehir(Sehir sehir) {
		this.sehir = sehir;
	}

	@Override
	public String toString() {
		return "Ogrenci [adi=" + adi + ", soyadi=" + soyadi + ", sehir=" + sehir + "]";
	}
	


}