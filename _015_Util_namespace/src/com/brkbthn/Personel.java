package com.brkbthn;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Personel {
	List <?> listemiz;
//	Set <?> setimiz;
//	Map <?,?> mapimiz;
//	Properties propertymiz;

	public List<?> getListemiz() {
		return listemiz;
	}

	public void setListemiz(List<?> listemiz) {
		this.listemiz = listemiz;
	}

	@Override
	public String toString() {
		return "Personel [listemiz=" + listemiz + "]";
	}



}
