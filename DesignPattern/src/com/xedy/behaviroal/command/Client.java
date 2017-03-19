/**
 * 
 */
package com.xedy.behaviroal.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xedy.behaviroal.command.impl.ConcreteCommand;

/**
 * @author xedy_zhang@126.com
 *
 */
public class Client {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	private Invoker invoker = new Invoker();
	private Receiver receiver = new Receiver();

	/**
	 * 发送请求消息
	 * @param message 请求消息
	 * @return 处理结果
	 */
	public String sendMessage(String message){
		log.debug("Client 发送请求信息。。。");
		ConcreteCommand command = new ConcreteCommand();
		log.debug("ConcreteCommand已实例化。");
		command.setReceiver(this.receiver);
		log.debug("Reciver已实例化。");
		this.invoker.setCommand(command);
		log.debug("command 已添加至 Invoker 队列。。。");
		
		return invoker.doCommand(message);
	}
}
