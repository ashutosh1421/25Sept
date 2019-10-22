package exceptionAssignment2;

import com.ashu.exceptions.InvalidDayException;
import com.ashu.exceptions.InvalidMonthException;

public class MyDateService {

	@SuppressWarnings("finally")
	public static String CheckMyDate(int day, int month) {
		
		boolean d = false,m=false;
		try {
			
			if((day<1||day>31)) throw new InvalidDayException("Enter correct day");
				d=true;
			if((month<1||month>12)) throw new InvalidMonthException("Enter correct month");
				m=true;
		}
		catch(InvalidDayException e)
		{
			System.out.println(e.getMessage());
			d=false;
		}
		catch(InvalidMonthException e) {
			System.out.println(e.getMessage());
			m=false;
		}
		finally {
			if(d==true&&m==true)
				return "Valid Date";
			else
				return "Invalid Date";
		}
	}
	
}
