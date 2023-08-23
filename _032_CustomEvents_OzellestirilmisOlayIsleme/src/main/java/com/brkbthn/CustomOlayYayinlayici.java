package com.brkbthn;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomOlayYayinlayici implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher applicationEventPublisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
		
	}
	
	public void yayinla() {
		System.out.println("CustomOlayYayinlayici sinifinin yayinla metotu");
		CustomOlay customOlay = new CustomOlay(this);
		applicationEventPublisher.publishEvent(customOlay);
	}
}
