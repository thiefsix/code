package com.wu.jee.listenner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class WebContextListenner implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println(getClass().getSimpleName()+"method name: contextDestroyde");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println(getClass().getSimpleName()+"method name: contextInitialized");
	}

}
