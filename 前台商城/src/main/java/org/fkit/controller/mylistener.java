package org.fkit.controller;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.*;
@WebListener
public class mylistener implements HttpSessionListener {

	private static int count=0;
	
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		setCount(getCount() + 1);
		
	}

	
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		setCount(getCount() - 1);
		
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		mylistener.count = count;
	}
   


}
