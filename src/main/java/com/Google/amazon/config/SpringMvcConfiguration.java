package com.Google.amazon.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class SpringMvcConfiguration {
	
	@EnableWebMvc
	@Configuration
	public class SpringMVCConfiguration implements WebMvcConfigurer {

	    @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
	        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
	        registry.addResourceHandler("/vendor/**").addResourceLocations("classpath:/static/vendor/");
	        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
	    }

	}
}
