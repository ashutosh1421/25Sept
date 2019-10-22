package basicInheritance;

public class DemoInheritance1_Service extends DemoInheritance1 {
	
	public static void main(String[] args) {
		
	 
		
		DemoInheritance1 MyDates= new DemoInheritance1();
		MyDates.setDd(13);
		MyDates.setMm(01);
		MyDates.setYyyy(1997);
		System.out.println(MyDates.getDd()+"/"+MyDates.getMm()+"/"+MyDates.getYyyy());
		
		
		DemoInheritance1 MyDates1= new DemoInheritance1();
		MyDates1.setDd(07);
		MyDates1.setMm(10);
		MyDates1.setYyyy(1988);
		System.out.println(MyDates1.getDd()+"/"+MyDates1.getMm()+"/"+MyDates1.getYyyy());
		
	}
	
		
}
