package oopConcepts;

public class EncapsulationConcept {
	private int i;
	private String str;
	
	private void method1() {
		System.out.println("I am private method");
	}
	// setter constructor with arguments
//	public EncapsulationConcept(int x, String s) {
//		this.i = x;
//		this.str = s;
//		this.method1();
//	}
	
	// setter methods
	public void setter(int x, String s) {
		this.i = x;
		this.str = s;
		this.method1();
	}
	
	// getter methods
	public int getterInt() {
		return i;
	}
	
	public String getterString() {
		return str;
	}

}

