/**
 * 
 */
package com.xedy.behaviroal.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xedy_zhang@126.com
 *
 */
public class Receiver {
	
	private Logger log = (Logger) LoggerFactory.getLogger(this.getClass());
	
	public String action(String message){
		log.debug("信息的实际处理者。IT IS ME !");
		return message.toUpperCase();
	}
	
	public boolean unAction(){
		log.debug("行为撤销。");
		return Boolean.TRUE.booleanValue();
	}
}
