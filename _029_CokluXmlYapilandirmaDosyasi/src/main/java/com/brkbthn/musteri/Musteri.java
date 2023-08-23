package com.brkbthn.musteri;

public class Musteri {
	public Musteri() {
		// TODO Auto-generated constructor stub
		System.out.println("musteri");
	}
	
	private String adi,soyadi, telNo;
	private Adres adres;
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
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}



}
