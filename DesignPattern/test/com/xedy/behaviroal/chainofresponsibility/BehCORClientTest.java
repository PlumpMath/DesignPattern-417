/**
 * 
 */
package com.xedy.behaviroal.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.xedy.behaviroal.chainofresponsibility.impl.ConcreteHandler_1;
import com.xedy.behaviroal.chainofresponsibility.impl.ConcreteHandler_2;

/**
 * @author xedy_zhang@126.com
 *
 */
public class BehCORClientTest {

	private List<Handler> handlerList = new ArrayList<Handler>();
	private Client client;
	
	@Before
	public void init(){
		handlerList.add(new ConcreteHandler_1());
		handlerList.add(new ConcreteHandler_2());
		
		client = new Client();
		client.setHandlerList(handlerList);
	}
	
	/**
	 * Test method for {@link com.xedy.behaviroal.chainofresponsibility.Client#doRequest(java.lang.String)}.
	 */
	@Test
	public void testDoRequest() {
		client.doRequest("handler1:message");
		//fail("Not yet implemented");
	}
}
