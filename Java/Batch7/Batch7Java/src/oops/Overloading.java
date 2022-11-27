package oops;

public class Overloading extends OverridingParent {
	// Polymorphism - Method Overloading / Compile time polymorphism / early-binding 
	//Overloading1 - method name = same + no. of arguments = same + argument types = different 
	
	public void addition(int a, int b) {
		int c = a + b;
		System.out.println("Addition is: " + c);
	}

	public void addition(int a, float b) {
		float c = a + b;
		System.out.println("Addition is: " + c);
	}
	
	//Overloading2 - method name = same + no. of arguments = different + argument types = same 
	public void addition(int a, int b, int d) {
		int c = a + b + d;
		System.out.println("Addition is: " + c);
	}
}
