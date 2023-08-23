package com.brkbthn;

public class Personel {
	private String adi, soyadi, anneAdi, babaAdi, adresi;
	private int dogumYili, maasi, telNo;
	private boolean ehliyeti, medeniHali;
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
	public String getAnneAdi() {
		return anneAdi;
	}
	public void setAnneAdi(String anneAdi) {
		this.anneAdi = anneAdi;
	}
	public String getBabaAdi() {
		return babaAdi;
	}
	public void setBabaAdi(String babaAdi) {
		this.babaAdi = babaAdi;
	}
	public String getAdresi() {
		return adresi;
	}
	public void setAdresi(String adresi) {
		this.adresi = adresi;
	}
	public int getDogumYili() {
		return dogumYili;
	}
	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;
	}
	public int getMaasi() {
		return maasi;
	}
	public void setMaasi(int maasi) {
		this.maasi = maasi;
	}
	public int getTelNo() {
		return telNo;
	}
	public void setTelNo(int telNo) {
		this.telNo = telNo;
	}
	public boolean isEhliyeti() {
		return ehliyeti;
	}
	public void setEhliyeti(boolean ehliyeti) {
		this.ehliyeti = ehliyeti;
	}
	public boolean isMedeniHali() {
		return medeniHali;
	}
	public void setMedeniHali(boolean medeniHali) {
		this.medeniHali = medeniHali;
	}
	@Override
	public String toString() {
		return "Personel [adi=" + adi + ", soyadi=" + soyadi + ", anneAdi=" + anneAdi + ", babaAdi=" + babaAdi
				+ ", adresi=" + adresi + ", dogumYili=" + dogumYili + ", maasi=" + maasi + ", telNo=" + telNo
				+ ", ehliyeti=" + ehliyeti + ", medeniHali=" + medeniHali + "]";
	}
	

	
	
}
