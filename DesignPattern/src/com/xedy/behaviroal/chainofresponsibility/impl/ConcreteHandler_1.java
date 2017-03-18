/**
 * 
 */
package com.xedy.behaviroal.chainofresponsibility.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xedy.behaviroal.chainofresponsibility.Handler;

/**
 * @author xedy_zhang@126.com
 *
 */
public class ConcreteHandler_1 implements Handler {
	private static Logger log = LoggerFactory.getLogger(ConcreteHandler_1.class);

	/* (non-Javadoc)
	 * @see com.xedy.behaviroal.chainofresponsibility.Handler#handleRequest()
	 */
	@Override
	public String handleRequest(String message) {
		log.debug("ConcreteHandler_1 process the request ... message is : {}",message);
		
		if(message.startsWith("handler1:"))
			return message.toUpperCase();
		else
			return null;
	}
}
