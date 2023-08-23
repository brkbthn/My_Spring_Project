package com.brkbthn;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class OlayTazelemeIsleyicisi implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		System.out.println("context tazeleniyor");
		
	}

}
