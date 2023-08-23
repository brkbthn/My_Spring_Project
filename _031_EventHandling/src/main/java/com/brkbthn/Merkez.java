package com.brkbthn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		// ApplicationContext context = new ClassPathXmlApplicationContext("cnf.xml"); 
		// bu hantaldır
		//((AbstractApplicationContext)context).registerShutdownHook();
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("cnf.xml");
		context.start();
		
		Sozler sozler = context.getBean("BeanSozler", Sozler.class);
		System.out.println(sozler.getCumle());
		context.refresh();
		context.stop();
		context.close();
		
}
}
