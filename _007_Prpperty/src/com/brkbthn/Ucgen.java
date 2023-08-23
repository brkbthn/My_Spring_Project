package com.brkbthn;

public class Ucgen {
	
	private String cesit;
	
	/* Eğer spring üzerinden değişkene değer atanacaksa mutlaka setter metot bulunması gerekir*/
	

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
