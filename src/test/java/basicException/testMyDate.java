package basicException;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.validator.ValidateWith;

import exceptionAssignment2.MyDateService;

public class testMyDate {

	Scanner sc = new Scanner(System.in);
	int day,month,year;
	
	@Before
	public void StartTest() {
		day = sc.nextInt();
		month = sc.nextInt();
		year=sc.nextInt(); 
	}
	
	@Test
	public void test1() {
		assertEquals("Valid Date",MyDateService.CheckMyDate(day, month) );
	}

	@Test
	public void test2() {
		assertEquals("Invalid Date",MyDateService.CheckMyDate(day, month) );
	}
	
	@After
	public void EndTest() {
		sc.reset();
	}
}
