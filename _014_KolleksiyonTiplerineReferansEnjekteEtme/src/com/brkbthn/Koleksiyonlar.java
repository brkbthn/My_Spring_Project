package com.brkbthn;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Koleksiyonlar {
	List <?> OgrenciList;
	Set <?> ogrenciSet;
	Map <?,?> ogrenciMap;
	Properties ogrenciProperties;
	public List<?> getOgrenciList() {
		return OgrenciList;
	}
	public void setOgrenciList(List<?> ogrenciList) {
		OgrenciList = ogrenciList;
	}
	public Set<?> getOgrenciSet() {
		return ogrenciSet;
	}
	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
	public Map<?, ?> getOgrenciMap() {
		return ogrenciMap;
	}
	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
	public Properties getOgrenciProperties() {
		return ogrenciProperties;
	}
	public void setOgrenciProperties(Properties ogrenciProperties) {
		this.ogrenciProperties = ogrenciProperties;
	}
	@Override
	public String toString() {
		return "Koleksiyonlar [OgrenciList=" + OgrenciList + ", ogrenciSet=" + ogrenciSet + ", ogrenciMap=" + ogrenciMap
				+ ", ogrenciProperties=" + ogrenciProperties + "]";
	}
	

}
