package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.example")
public class SpringXmlClass  extends WebMvcConfigurerAdapter{
	
	@Bean
	public ViewResolver getViewResolver1(){
		InternalResourceViewResolver v=new InternalResourceViewResolver();
		v.setViewClass(JstlView.class);
		v.setPrefix("/WEB-INF/views/");
		v.setSuffix(".jsp");
		
		
		return v;
	}


	
	   @Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			   registry.addResourceHandler("/assets/**").addResourceLocations("/assets/template");
		}


}
