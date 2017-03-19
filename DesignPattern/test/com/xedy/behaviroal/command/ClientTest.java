/**
 * 
 */
package com.xedy.behaviroal.command;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author xedy_zhang@126.com
 *
 */
public class ClientTest {

	/**
	 * Test method for {@link com.xedy.behaviroal.command.Client#sendMessage(java.lang.String)}.
	 */
	@Test
	public void testSendMessage() {
		Client client = new Client();
		String rtnMsg = client.sendMessage("life is color ...");
		assertNotNull(rtnMsg);
		
		//fail("Not yet implemented");
	}

}
