package basicException;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ashu.exceptions.invalidInputException;

import basicExceptions.Factorial;

public class TestFactorial {

	Scanner sc = new Scanner(System.in);
	int number;

	@Before
	public void inputNumber() {
		number = sc.nextInt();
	}

	@Test
	public void testNumberisGreaterThan2() throws invalidInputException {

		assertEquals(Factorial.getFactorial(number), Factorial.getFactorial(number));
	}

	@Test
	public void testNumberIsLessThan2() throws invalidInputException {

		assertEquals(Factorial.getFactorial(1), Factorial.getFactorial(number));

	}

	@After
	public void endTest() {
		sc.reset();
	}
}
