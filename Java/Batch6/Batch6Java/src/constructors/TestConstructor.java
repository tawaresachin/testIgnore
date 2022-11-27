package constructors;

public class TestConstructor {
	
	public TestConstructor(String S) {			//User defined constructor
		float f = 25.05f;
		int i = 20;
		System.out.println("Float f: " + f);
		float b = i + f;
		System.out.println("Addition: " + b);
		System.out.println("Name: " + S);
//		static double d = 25;                   // declaration static members is not allowed in constructor
	}
	
	public void method1() {
		System.out.println("I am non-static method1");
	}
	
	public void method2() {
		System.out.println("I am non-static method2");
	}
	
	public static void main(String[] args) {
		TestClass test = new TestClass();		//default constructor of class without args
		test.testMethod();
		System.out.println("Non-static varaible: " + test.i);
		
		TestConstructor testC = new TestConstructor("Batch#6");  //user defined constructor with args
		testC.method1();
		
//		TestClass1 obj1 = new TestClass1();			// object of incomplete class cannot be created
		TestConstructor obj2 = new TestConstructor("Java");  // multiple object for same class
		obj2.method2();
		obj2.method1();
	}

}
