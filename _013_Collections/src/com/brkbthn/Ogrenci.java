package com.brkbthn;
import java.util.*;

public class Ogrenci {
	
	List <?> OgrenciList;
	Set <?> ogrenciSet;
	Map <?,?> ogrenciMap;
	Properties ogrenciProperties;
	public List<?> getOgrenciList() {
		System.out.println("Lİste elemanları: "+ OgrenciList);
		return OgrenciList;
	}
	public void setOgrenciList(List<?> ogrenciList) {
		OgrenciList = ogrenciList;
	}
	public Set<?> getOgrenciSet() {
		System.out.println("Set elemanları: "+ogrenciSet);
		return ogrenciSet;
	}
	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
	public Map<?, ?> getOgrenciMap() {
		System.out.println("Map elemanları: "+ogrenciMap);
		return ogrenciMap;
	}
	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
	public Properties getOgrenciProperties() {
		System.out.println("Properties elemanları: "+ ogrenciProperties);
		return ogrenciProperties;
	}
	public void setOgrenciProperties(Properties ogrenciProperties) {
		this.ogrenciProperties = ogrenciProperties;
	}
	
	
   
}
