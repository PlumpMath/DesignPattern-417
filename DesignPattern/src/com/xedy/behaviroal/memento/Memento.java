/**
 * 
 */
package com.xedy.behaviroal.memento;

import java.util.Map;

/**
 * @author xedy_zhang@126.com
 *
 */
public class Memento {
	private Map<String,Object> state;

	/**
	 * @return the state
	 */
	public Map<String, Object> getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(Map<String, Object> state) {
		this.state = state;
	}
	
}
