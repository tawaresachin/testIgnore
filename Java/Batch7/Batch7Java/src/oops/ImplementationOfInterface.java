package oops;

public class ImplementationOfInterface implements OopsInterface {

	@Override
	public void method1() {
		System.out.println("I am method-1");		
	}

	@Override
	public void method2() {
		System.out.println("I am method-2");		
	}
	
	public void method3() {
		System.out.println("I am additional method-3");
	}
}
