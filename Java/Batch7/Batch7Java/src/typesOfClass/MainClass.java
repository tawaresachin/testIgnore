package typesOfClass;

public class MainClass {

	public static void main(String[] args) {
		ConcreteClass obj = new ConcreteClass();
		obj.method1();
		obj.method2();
		
//		AbstractClass obj1 = new AbstractClass();	//object of abstract class cannot be created
		
		AbstarctImplementation obj2 = new AbstarctImplementation();
		obj2.method4();
		obj2.method5();
		obj2.method6();
		
//		DemoInterface obj4 = new DemoInterface(); //object of interface cannot be created
		InterfaceImplementation obj5 = new InterfaceImplementation();
		DemoInterface obj6 = new InterfaceImplementation();  //create object of interface with implementation class
		
		//Accessing all methods of implementation class
		obj5.method7();
		obj5.method8();
		obj5.method9();
		
		//Accessing only methods of Interface
		obj6.method7();
		obj6.method8();
		
		//Variables in interface are by default public-static-final & initialized
//		obj6.i=200;  
//		obj6.str="Overriding value";
	}
}
