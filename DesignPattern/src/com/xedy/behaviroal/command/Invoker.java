/**
 * 
 */
package com.xedy.behaviroal.command;

import java.util.LinkedList;

/**
 * @author xedy_zhang@126.com
 *
 */
public class Invoker {
	
	private ThreadLocal<Command> local = new ThreadLocal<Command>();
	
	private LinkedList<Command> queue = new LinkedList<Command>();
	
	/**
	 * 执行调用
	 * @param message 请求信息
	 * @return 处理结果
	 */
	public String doCommand(String message){
		Command command = queue.pop();
		local.set(command);
		return local.get().execute(message);
	}
	
	/**
	 * 撤销执行某命令
	 * @return 执行结果
	 */
	public boolean undoCommand(){
		Command command = queue.pop();
		local.set(command);
		return local.get().undo();
	}

	/**
	 * @param command the command to set
	 */
	public void setCommand(Command command) {
		queue.add(command);
	}
}
