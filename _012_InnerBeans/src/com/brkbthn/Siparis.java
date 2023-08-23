package com.brkbthn;

public class Siparis {
	int tutar;

	/**
	 * 
	 */
	public Siparis() {
		System.out.println("siparis sınıfının parametresi kurucu metodu");
	}

	/**
	 * @param tutar
	 */
	public Siparis(int tutar) {
		
		this.tutar = tutar;
	}

	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		this.tutar = tutar;
	}
	
	public void toplamSonucuAl() {
		System.out.println("siparis sınıfının tutar sonucu metodu");
		System.out.println("TOPLAM:"+getTutar());
	}

	
}
