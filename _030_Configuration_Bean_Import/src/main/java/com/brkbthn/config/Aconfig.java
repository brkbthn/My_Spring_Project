package com.brkbthn.config;

import org.springframework.context.annotation.Configuration;

import com.brkbthn.A;

import org.springframework.context.annotation.Bean;

@Configuration

public class Aconfig {
	@Bean(name="BeanA")
	public A yaz() {
		return new A();

}
}