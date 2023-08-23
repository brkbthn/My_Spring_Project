package com.brkbthn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Cizim {

	public static void main(String[] args) {
		
	//	Resource resource = new FileSystemResource("camelContext.xml");
	//	XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		
		
		//CONFIG dosyası uzaktaysa
	//	ClassPathResource classPathResource = new ClassPathResource("springContext.xml");
	//	BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		
	//	ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");   
	//	BeanFactory beanFactory = context;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");   
		
		Ucgen ucgen = (Ucgen) context.getBean("ucgen");
		
		ucgen.ciz();
		System.out.println("berk");
	}

}