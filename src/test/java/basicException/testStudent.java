package basicException;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.ashu.exceptions.AgeNotWithinRangeException;

import basicExceptions.Student;
import basicExceptions.StudentService;

public class testStudent {

	Scanner sc= new Scanner(System.in);
	Student student= new Student();
	
	
	
	@Before
	public void StartTest() {
		student.setRoll_no(sc.nextInt());
		student.setName(sc.next());
		student.setAge(sc.nextInt());
		student.setCourse(sc.next());
	}
	
	@Test
	public void testAge1() throws AgeNotWithinRangeException {
		
		
		assertEquals(true,StudentService.CheckAge(student.getAge()));
		
	}
	
	@Test
	public void testAge2() throws AgeNotWithinRangeException {
		
		
		assertEquals(false,StudentService.CheckAge(student.getAge()));
		
	}
	
	@Test
	public void testName1() throws AgeNotWithinRangeException {
		
		
		assertEquals(true,StudentService.CheckName(student.getName()));
		
	}
	
	@Test
	public void testName2() throws AgeNotWithinRangeException {
		
		
		assertEquals(false,StudentService.CheckName(student.getName()));
		
	}
}
