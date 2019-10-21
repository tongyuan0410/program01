package com.dzkj;


import javax.servlet.Filter;
import javax.servlet.Servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
//扫描本包或子包下的注解组件
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.dzkj.filter.HelloFilter;
import com.dzkj.servlet.secondservlet;
@SpringBootApplication
@ServletComponentScan
public class App {
	public static void main(String[] args) {
		//springboot开机
	SpringApplication.run(App.class, args);
	}
	@Bean
	public ServletRegistrationBean<Servlet> get(){
		ServletRegistrationBean<Servlet> bean = new ServletRegistrationBean<Servlet>(new secondservlet());
		bean.addUrlMappings("/second");
		return bean;
	}
	@Bean
	public FilterRegistrationBean<Filter> getFilter(){
		FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>(new HelloFilter());
		bean.addUrlPatterns("/*");
		return bean;
	}
	
}
