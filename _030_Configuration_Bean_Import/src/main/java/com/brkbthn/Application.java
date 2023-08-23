package com.brkbthn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.brkbthn.config.SpringConfig;

import org.springframework.context.annotation.*;

@SuppressWarnings("unused")
public class Application {

	public static void main(String[] args) {

		
	//	ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
	context.register(SpringConfig.class);
	context.refresh();
	
	
	A aNesnesi = context.getBean("BeanA", A.class);
	aNesnesi.yaz("brkbthn");
	
	
	B bNesnesi = context.getBean("BeanB", B.class);
	aNesnesi.yaz("brkbthnDVRN ");
	
	//context.close(); //application context in kapatılması
	((ConfigurableApplicationContext)context).close(); //application context in kapatılması
	
	 
	

}
}