/**
 * 
 */
package com.xedy.behaviroal.command;

/**
 * @author xedy_zhang@126.com
 *
 */
public interface Command {
	public String execute(String message);
	public boolean undo();
}