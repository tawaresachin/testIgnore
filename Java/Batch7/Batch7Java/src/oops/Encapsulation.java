package oops;

public class Encapsulation {
	// private data members
	private int i;
	private String str;
	
//	// approach-1 --> getter - setter approach
//	public String getStr() {
//		return str;
//	}
//
//	public void setStr(String str) {
//		this.str = str;
//	}
//
//	public void setterI(int val) {
//		this.i = val;		//temporary replacement of object OR placeholder of current class object
//	}
//	
//	public int getterI() {
//		return i;
//	}
//	
	//approach-2 --> getter- constructor approach
	
	// this method will return integer value of i
	public int getI() {
		return i;
	}
	
	public String getterStr() {
		return str;
	}
	
	public Encapsulation(int val1, String val2) {
		this.i = val1;
		this.str = val2;
	}
	
	// private methods
	private void testMethod() {
		System.out.println("I am private method");
	}
	
	public void getterTestMethod() {
		this.testMethod();
	}
	



}
