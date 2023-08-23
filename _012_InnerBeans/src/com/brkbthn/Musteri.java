package com.brkbthn;

public class Musteri {
	private Siparis siparis;

	/**
	 * 
	 */
	public Musteri() {
		System.out.println("musteri sınıfının parametresi kurucu metodu");
	}

	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		this.siparis = siparis;
	}
	
	public void hesabiOde() {
		System.out.println("Musteri sinifinin hesabi ode metodu.");
		siparis.toplamSonucuAl();
	}
	

}
