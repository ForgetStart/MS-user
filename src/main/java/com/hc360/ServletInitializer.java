package com.hc360;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {  
  
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) { 
    	System.out.println("ServletInitializer in ....");
        return application.sources(StartSpringBoot.class);  
    }  
  
}
