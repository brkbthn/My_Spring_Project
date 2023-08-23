package com.brkbthn;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitSelam implements BeanPostProcessor {
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("baslatmadan once");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("baslatmadan sonra");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	
	//başlatmanın hemen öncei ve hemen sonrasında çalışacak metotlar 

}
