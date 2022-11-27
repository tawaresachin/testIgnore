package typesOfMethod;

public class TestClass {
	
	float f = 25.05f;
	static double d = 255.55;
	
	//nonstatic method without args
	public void nonstaticMethod1() {
		System.out.println("I am non-static method1");
	}
	
	//nonstatic method with args
	public void nonstaticMethod2(int i, String s) {
		System.out.println("Roll No.: " + i);
		System.out.println("Name: " + s);
	}
	
	//static method without args
	public static void staticMethod1() {
		System.out.println("I am static method1");
	}
	
	//static method with args
	public static void staticMethod2(int i, String s) {
		System.out.println("Roll No.: " + i);
		System.out.println("Name: " + s);
	}
	
	public void nonStaticVariableAccess() {
		System.out.println("Non-Static Variable: " + f);		//non-static variable
		System.out.println("Static Variable: " + d);			//static variable
	}
	
	public static void staticVariableAccess() {
//		System.out.println("Non-Static Variable: " + f);		//non-static variable
		System.out.println("Static Variable: " + d);			//static variable
	}
	
	public void method1() {
		System.out.println("-----Non-static------");
//		nonstaticMethod1();
		nonstaticMethod1();					//non-static method
		staticMethod1();							//static method
	}
	
	public static void method2() {
		System.out.println("-------static---------");
		new TestClass().nonstaticMethod1();					//non-static method with object
//		nonstaticMethod1();									//direct non-static method
		staticMethod1();							//static method
	}

}

