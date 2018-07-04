package com.hook.xcs60;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class Xcs60Application {

	public static void main(String[] args) {
		SpringApplication.run(Xcs60Application.class, args);
	}
	
	@Bean(name = DispatcherServletAutoConfiguration.DEFAULT_DISPATCHER_SERVLET_BEAN_NAME)
	public DispatcherServlet dispatcherServlet() {
	    DispatcherServlet dispatcherServlet = new DispatcherServlet();
	    dispatcherServlet.setDispatchOptionsRequest(true);
	    return dispatcherServlet;
	}
}
