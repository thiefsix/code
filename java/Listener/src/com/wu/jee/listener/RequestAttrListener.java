package com.wu.jee.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class RequestAttrListener implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent event) {
		System.out.println("RequestAttrListener added name-->"+event.getName()+"value-->"+event.getValue());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent event) {
		System.out.println("RequestAttrListener removed name-->"+event.getName()+"value-->"+event.getValue());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent event) {
		System.out.println("RequestAttrListener replaced name-->"+event.getName()+"value-->"+event.getValue());
	}

}
