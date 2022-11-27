package testPackage;

import aceessInJava.AccessClass;

public class TestClass {

	public static void main(String[] args) {
		AccessClass obj = new AccessClass();
		System.out.println(obj.i);             //non-static variable with public access modifier in different package
		System.out.println(AccessClass.j);		//static variable with public access modifier in different package

//		System.out.println(obj.d);				//non-static variable with protected access within diff package cannot be used
//		System.out.println(AccessClass.dbl);	//static variable with protected access within diff package cannot be used
		
		obj.publicMethod();
		AccessClass.publicMethod1();
		
//		obj.protectedMethod();
//		AccessClass.protectedMethod1)();		
		
	}

}
