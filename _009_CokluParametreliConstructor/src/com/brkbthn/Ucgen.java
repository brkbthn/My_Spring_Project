package com.brkbthn;

public class Ucgen {
	
	private String cesit;
	private int yukseklik;
	private double alan;
	
	
	
	/**
	 * @param cesit
	 * @param yukseklik
	 * @param alan
	 */
	public Ucgen(String cesit, int yukseklik, double alan) {
		this.cesit = cesit;
		this.yukseklik = yukseklik;
		this.alan = alan;
	}

	/*public Ucgen(String cesit) {
		this.cesit = cesit;
	}
	
	public Ucgen(String cesit, int yukseklik) {
		this.cesit = cesit;
		this.yukseklik = yukseklik;
	}*/

	// xml tarafında propertilere deger atanabilmesi için settter methotlar mutlaka bulunmalıdır.
	public String getCesit() {
		return cesit;
	}


	public void setCesit(String cesit) {
		this.cesit = cesit;
	}


	public void ciz() {
		System.out.println(getAlan()+" alnanina sahip "+ getYukseklik()+" yuksekliginde " + getCesit() + " ucgen ciz");
	}




	public int getYukseklik() {
		return yukseklik;
	}


	public void setYukseklik(int yukseklik) {
		this.yukseklik = yukseklik;
	}

	public double getAlan() {
		return alan;
	}

	public void setAlan(double alan) {
		this.alan = alan;
	}

}
