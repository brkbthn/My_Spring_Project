package com.brkbthn;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class OlayDurdurmaIsleyicisi implements ApplicationListener<ContextStoppedEvent> {

	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		
		System.out.println("ContextStoppedEvent:  OlayDurdurmaIsleyicisi ");
		
	}

}
