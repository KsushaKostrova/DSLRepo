package com.kostrova.store;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan("com.kostrova.store")
public class WebAppConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver viewResolver() {
    	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    	viewResolver.setPrefix("/views/");
    	viewResolver.setSuffix(".jsp");
    	viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    } 
    
    @Bean
	public GoodService goodService() {
		return new GoodServiceImpl();		
	}
	
	@Bean
	public IGoodDao goodRepository() {
		return new GoodDaoImpl();
	}
}