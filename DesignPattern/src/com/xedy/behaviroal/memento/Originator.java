/**
 * 
 */
package com.xedy.behaviroal.memento;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xedy_zhang@126.com
 *
 */
public class Originator {
	private String name;
	private long remain;
	private Date transTime;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the remain
	 */
	public long getRemain() {
		return remain;
	}
	/**
	 * @param remain the remain to set
	 */
	public void setRemain(long remain) {
		this.remain = remain;
	}
	/**
	 * @return the transTime
	 */
	public Date getTransTime() {
		return transTime;
	}
	/**
	 * @param transTime the transTime to set
	 */
	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}
	
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public void setMemento(Memento memento){
		Map<String,?> state = memento.getState();
		this.name = (String)state.get("name");
		this.remain = ((Long)state.get("remain")).longValue();
		this.transTime = (Date)state.get("transTime");
		
		log.debug("恢复后状态信息：{},{},{}",this.name,this.remain,this.transTime);
	}
	
	public Memento createMemento(){
		Memento memento = new Memento();
		Map<String,Object> state = memento.getState();
		if(state == null){
			state = new HashMap<String,Object>();
			memento.setState(state);
		}
		
		state.put("name", this.name);
		state.put("remain", this.remain);
		state.put("transTime", this.transTime);

		log.debug("保存状态信息：{},{},{}",this.name,this.remain,this.transTime);
		
		return memento; 
	}
}
