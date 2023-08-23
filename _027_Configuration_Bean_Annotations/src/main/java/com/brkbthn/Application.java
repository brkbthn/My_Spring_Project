package com.brkbthn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.*;

@SuppressWarnings("unused")
public class Application {

	public static void main(String[] args) {

		
	//	ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
	context.register(SpringConfig.class);
	
	context.refresh();//application contextin tazelenmesi
	
	Ogrenci ogrenci = context.getBean(Ogrenci.class);
	System.out.println(ogrenci);
	
	
	
	//context.close(); //application context in kapatılması
	((ConfigurableApplicationContext)context).close(); //application context in kapatılması
	
	 
	

}
}