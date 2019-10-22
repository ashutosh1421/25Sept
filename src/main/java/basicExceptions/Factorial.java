package basicExceptions;
import com.ashu.exceptions.*;

public class Factorial {

	public static int getFactorial(int number) {
		int fact = 1;
		try {

		if(number<2)throw new invalidInputException("invalid");
		
		else {
		for(int i=number;i>=2;i--) {
			fact*=i;
		}
		}
		
		
		}
		catch(invalidInputException e) {
			System.out.println(e.getMessage());
		}
		return fact;
		}
	

}
