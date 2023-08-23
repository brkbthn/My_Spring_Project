package com.brkbthn;

import com.brkbthn.*;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomOlayIsleyici implements ApplicationListener<CustomOlay>{

	@Override
	public void onApplicationEvent(CustomOlay event) {
		System.out.println("CustomOlatIsleyici sinifinin onnApplicationEvent metotu");
	}
}
