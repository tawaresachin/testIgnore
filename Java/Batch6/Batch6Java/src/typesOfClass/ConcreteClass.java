package typesOfClass;

public class ConcreteClass {
	
	public void method1() {
		System.out.println("I am method-1 of concrete class");
	}
	
	public static void method2() {
		System.out.println("I am a static moethod-2 of concrete class");
	}
	
	private void method3() {
		System.out.println("I am a private moethod-3 of concrete class");
	}
	
	public void method4() {
		method3();
	}

}

