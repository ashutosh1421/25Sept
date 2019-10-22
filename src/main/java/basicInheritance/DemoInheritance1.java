package basicInheritance;

public class DemoInheritance1 {
  
	private int dd;
	private int mm;
	private int yyyy;
	
	public DemoInheritance1() {
		
	}
	
	
	public DemoInheritance1(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}


	public int getDd() {
		
		
		return dd;
	}
	public int setDd(int dd) {
		this.dd = dd;
		return dd;
	}
	public int getMm() {
		
		
		return mm;
	}
	public int setMm(int mm) {
		this.mm = mm;
		return mm;
		
	}
	public int getYyyy() {
		
		
		return yyyy;
	}
	public int setYyyy(int yyyy) {
		this.yyyy = yyyy;
		return yyyy;
	}
	

	@Override
	public String toString() {
		return "DemoInheritance1 [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}


	
	
}
