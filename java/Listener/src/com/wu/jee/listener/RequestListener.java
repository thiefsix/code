package com.wu.jee.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("RequestListener destroyed "+event.getServletRequest());
	}

	@Override
	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("RequestListener init "+event.getServletRequest());
	}

}
