package com.brkbthn.config;

import org.springframework.context.annotation.Configuration;

import com.brkbthn.B;

import org.springframework.context.annotation.Bean;

@Configuration

public class Bconfig {
	@Bean(name="BeanB")
	public B yaz() {
		return new B();

}
}