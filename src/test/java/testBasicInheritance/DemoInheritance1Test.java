package testBasicInheritance;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import basicInheritance.DemoInheritance1;
import basicInheritance.DemoInheritance1_Service;

public class DemoInheritance1Test extends DemoInheritance1 {

	
	
	
	@Test
	public void testSetter() {
		
		final DemoInheritance1 MyDates= new DemoInheritance1();
		MyDates.setDd(13);
		MyDates.setMm(1);
		MyDates.setYyyy(1997);
		
		assertEquals(MyDates.getDd(), MyDates.setDd(13));

		assertEquals(MyDates.getMm(), MyDates.setMm(1));

		assertEquals(MyDates.getYyyy(), MyDates.setYyyy(1997));
		System.out.println(MyDates.getDd()+"/"+MyDates.getMm()+"/"+MyDates.getYyyy());
		
	}
	
	
	@Test
	public void testSetter1() {
		
		final DemoInheritance1 MyDates1= new DemoInheritance1();
		MyDates1.setDd(30);
		MyDates1.getDd();
		MyDates1.setMm(6);

		MyDates1.getMm();
		MyDates1.setYyyy(1998);

		MyDates1.getYyyy();
		
		
		assertEquals(MyDates1.getDd(), MyDates1.setDd(30));

		assertEquals(MyDates1.getMm(), MyDates1.setMm(6));

		assertEquals(MyDates1.getYyyy(), MyDates1.setYyyy(1998));
		System.out.println(MyDates1.getDd()+"/"+MyDates1.getMm()+"/"+MyDates1.getYyyy());
		
	}

}
