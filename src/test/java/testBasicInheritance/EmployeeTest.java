package testBasicInheritance;
import com.ashu.basicInheritance.Employee;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest extends Employee {
	
	Scanner sc= new Scanner(System.in);
	int empId;
	String empName;
	double basicSal;
	double Medical;

	@Before
	public void InputDetails() {
	System.out.println("Enter Employee Id");
	empId= sc.nextInt();
	System.out.println("Enter Employee Name");
	empName=sc.next();
	System.out.println("Enter Basic Salary");
	basicSal=sc.nextDouble();
	System.out.println("Enter Medical");
	Medical=sc.nextDouble();
	
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGivenDetails() {
		final Employee empDetails= new Employee();
		empDetails.setEmployeeId(empId);
		empDetails.setEmployeeName(empName);
		empDetails.setBasicSalary(basicSal);
		empDetails.setHra(basicSal);
		empDetails.setMedical(Medical);
		empDetails.setPf(basicSal);
		empDetails.setPt(200);
		empDetails.setGrossSalary();
		empDetails.setNetSalary(Medical);
		
		assertEquals(empDetails.getEmployeeId(), empId);
		assertEquals(empDetails.getEmployeeName(), empName);
		assertEquals(empDetails.getBasicSalary(), basicSal, 0.002);
		assertEquals(empDetails.getMedical(), Medical,0.02);
		assertEquals(empDetails.getPf(),empDetails.setPf(basicSal),0.02);
		assertEquals(empDetails.getGrossSalary(), empDetails.setGrossSalary(), 0.02);
		assertEquals(empDetails.getNetSalary(), empDetails.setNetSalary(Medical), 0.02);

		
		System.out.println("empId="+empDetails.getEmployeeId()+"Emp NAME= "+empDetails.getEmployeeName()+" Basic Salary="+empDetails.getBasicSalary()+"HRA="+empDetails.getHra()+"Medical="+empDetails.getMedical()+"PF="+empDetails.getPf()+"PT="+empDetails.getPt()+"Net Salary="+empDetails.getNetSalary()+"Gross Salary="+empDetails.getGrossSalary());
		
	}

}
