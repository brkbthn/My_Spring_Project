package com.brkbthn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

 @SuppressWarnings("deprecation")
public class Cizim {

	public static void main(String[] args) {
		
	//	Resource resource = new FileSystemResource("camelContext.xml");
	//	XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
		
		
		//CONFIG dosyası uzaktaysa
	//	ClassPathResource classPathResource = new ClassPathResource("springContext.xml");
	//	BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");   
		BeanFactory beanFactory = context;
		
		Ucgen ucgen = (Ucgen) beanFactory.getBean("ucgen");
		
		ucgen.ciz();
		System.out.println("berk");
	}

}
