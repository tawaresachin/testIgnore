package testPackage;

import aceessInJava.AccessClass;

public class TestClass1 extends AccessClass {

	public static void main(String[] args) {
		TestClass1 obj = new TestClass1();
		System.out.println(obj.d);		//non-static variable with protected access within diff package can be used with inheritance
		System.out.println(TestClass1.dbl); //static variable with protected access within diff package can be used with inheritance
		
//		System.out.println(obj.c);		//non-static variable with default access within diff package cannot be used
//		System.out.println(TestClass1.chr); //static variable with default access within diff package cannot be used
	
		obj.protectedMethod();
		TestClass1.protectedMethod1();
		
//		obj.defaultClass();
//		TestClass1.defaultClass1();
	}

}
