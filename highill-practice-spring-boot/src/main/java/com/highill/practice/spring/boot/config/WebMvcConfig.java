package com.highill.practice.spring.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Autowired
	private InterceptorCService interceptorCService;

	@Autowired
	private InterceptorBService interceptorBService;

	@Override
	public void addInterceptors(InterceptorRegistry interceptorRegistor) {
		interceptorRegistor.addInterceptor(interceptorCService);
		interceptorRegistor.addInterceptor(interceptorBService);
	}

}
