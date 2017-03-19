/**
 * 
 */
package com.xedy.behaviroal.command.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xedy.behaviroal.command.Command;
import com.xedy.behaviroal.command.Receiver;

/**
 * @author xedy_zhang@126.com
 *
 */
public class ConcreteCommand implements Command {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	private Receiver receiver;
	
	/* (non-Javadoc)
	 * @see com.xedy.behaviroal.command.Command#execute(java.lang.String)
	 */
	@Override
	public String execute(String message) {
		log.debug("请求参数：{}",message);
		String retMsg = receiver.action(message);
		log.debug("收到消息处理返回的消息。。。。。ConcreteCommand：{}",retMsg);
		return retMsg;
	}

	/* (non-Javadoc)
	 * @see com.xedy.behaviroal.command.Command#undo()
	 */
	@Override
	public boolean undo() {
		log.debug("此命令被撤销……");
		return this.receiver.unAction();
	}

	/**
	 * @return the receiver
	 */
	public Receiver getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
}
