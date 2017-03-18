/**
 * 
 */
package com.xedy.behaviroal.chainofresponsibility;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xedy_zhang@126.com
 *
 */
public class Client {
	private static Logger log = LoggerFactory.getLogger(Client.class);
	
	public String doRequest(String message){
		log.debug("message is : {}",message);
		if(handlerList != null){
			log.debug("handlerList is not null ... ");
			for (Handler handler : handlerList) {
				String result = handler.handleRequest(message);
				log.debug("handler return the result is : {}",result);
				if(result != null)
					return result;
			}
		}
		log.trace("finish...");
		return null;
	}
	
	private List<Handler> handlerList;

	/**
	 * @param handlerList the handlerList to set
	 */
	public void setHandlerList(List<Handler> handlerList) {
		this.handlerList = handlerList;
	}
	
	public String sendRequest(){
		return null;
	}
}