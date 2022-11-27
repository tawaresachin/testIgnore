package oops;

public class OverridingParent {
	public void addition(int a, int b) {
		int c = a + b;
		System.out.println("Addition is: " + c);
	}
	
	public void addition(int a, int b, float d) {
		float c = a + b + d;
		System.out.println("Addition is: " + c);
	}
}
