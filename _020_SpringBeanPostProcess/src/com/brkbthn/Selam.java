package com.brkbthn;

public class Selam {
		private String mesaj;

		public String getMesaj() {
			return mesaj;
		}

		public void setMesaj(String mesaj) {
			this.mesaj = mesaj;
		}
		public void goster() {
			System.out.println(getMesaj());
		}
		public void init() {
			System.out.println("bean baslatiliyor...");
		}
		public void destroy() {
			System.out.println("bean sonlandiriliyor...");
		}
}
