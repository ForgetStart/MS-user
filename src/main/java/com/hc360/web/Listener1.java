package com.hc360.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener1 implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Listener1 contextInitialized...");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Listener1 contextDestroyed...");
		
	}



}
