package com.brkbthn;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SelamApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("camelContext.xml");
		
		Selam selamNesnesi1 = context.getBean("selam", Selam.class);
		
		selamNesnesi1.setMesaj("berk batuhan devran");
		selamNesnesi1.goster();
		
		
		Selam selamNesnesi2 = context.getBean("selam", Selam.class);
		selamNesnesi2.setMesaj("Mustafa Kemal ATATURK");
		selamNesnesi2.goster();
		
		System.out.println(context.getBean("selam", Selam.class));
		System.out.println(context.getBean("selam", Selam.class));
		System.out.println(context.getBean("selam", Selam.class));
		System.out.println(context.getBean("selam", Selam.class));
		System.out.println(context.getBean("selam", Selam.class));
		
		
		((AbstractApplicationContext)context).registerShutdownHook();
}
}