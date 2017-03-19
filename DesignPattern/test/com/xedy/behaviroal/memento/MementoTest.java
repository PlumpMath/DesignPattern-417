/**
 * 
 */
package com.xedy.behaviroal.memento;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Calendar;

import org.junit.Test;

/**
 * @author xedy_zhang@126.com
 *
 */
public class MementoTest {

	@Test
	public void test() {
		Originator originator = new Originator();
		originator.setName("name");
		originator.setRemain(1000L);
		Calendar time = Calendar.getInstance();
		time.set(Calendar.SECOND,-100);
		originator.setTransTime(time.getTime());
		
		Caretaker taker = new Caretaker();
		Memento memento = originator.createMemento();
		taker.putMemento(Originator.class, memento);

		originator.setName("name_new");
		originator.setRemain(2000L);
		originator.setTransTime(Calendar.getInstance().getTime());
		
		memento = taker.getMemento(Originator.class);
		originator.setMemento(memento);
		
		assertEquals("name", originator.getName());
		assertEquals(1000L, originator.getRemain());
		assertEquals(time, originator.getTransTime());
		
		//fail("Not yet implemented");
	}

}
