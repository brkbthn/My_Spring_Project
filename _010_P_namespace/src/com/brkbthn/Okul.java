package com.brkbthn;

public class Okul {
	private String kurumAdi;

	public String getKurumAdi() {
		return kurumAdi;
	}

	public void setKurumAdi(String kurumAdi) {
		this.kurumAdi = kurumAdi;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getKurumAdi();
	}
}
