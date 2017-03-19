/**
 * 
 */
package com.xedy.behaviroal.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xedy_zhang@126.com
 *
 */
public class Caretaker {
	private Map<Class,Memento> container = new HashMap<Class,Memento>();
	
	public void putMemento(Class key,Memento memento){
		this.container.put(key, memento);
	}
	
	public Memento getMemento(Class key){
		return this.container.get(key);
	}
}
