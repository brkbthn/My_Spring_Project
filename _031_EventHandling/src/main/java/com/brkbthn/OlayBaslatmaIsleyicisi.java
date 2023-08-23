package com.brkbthn;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class OlayBaslatmaIsleyicisi implements ApplicationListener<ContextStartedEvent>{
	// ApplicationListener: olayı takip eder

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		
		System.out.println("ContextStartedEvent:   OlayBaslatmaIsleyicisi "+event.getTimestamp());
		
	}
}
