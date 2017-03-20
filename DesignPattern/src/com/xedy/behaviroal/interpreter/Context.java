/**
 * 
 */
package com.xedy.behaviroal.interpreter;

import java.util.Stack;

/**
 * @author xedy_zhang@126.com
 *
 */
public class Context {
	/**
	 * 此操作符
	 */
	public enum OPERATORS{
		$PUT("$put"),
		$RMV("$RMV"),
		$CACHE("$CACHE"),
		$SAVE("$SAVE");
		
		private String value;
		
		OPERATORS(String value){
			this.value = value;
		}
		
		public String toString(){
			return this.value;
		}
	}
	
	/**
	 * 断句的标点符号
	 */
	public enum PUNCTUATION{
		_BLANK(" "),
		_LINE("\r\n");
		
		private String symbol;
		
		PUNCTUATION(String symbol){
			this.symbol = symbol;
		}
	}
	
	private Stack<Object> sentenceStack;
}