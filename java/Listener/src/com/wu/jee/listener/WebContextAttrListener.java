package com.wu.jee.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class WebContextAttrListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("WebContextAttrListener added name-->"+event.getName()+"value-->"+event.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("WebContextAttrListener removed name-->"+event.getName()+"value-->"+event.getValue());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("WebContextAttrListener replaced name-->"+event.getName()+"value-->"+event.getValue());
	}

}
