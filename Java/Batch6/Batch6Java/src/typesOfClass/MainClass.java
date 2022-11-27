package typesOfClass;

public class MainClass {
	
	//Static block gets executed before main method
	static{
		System.out.println("I am static block");
	}

	//Main method is system defined method & only entity that can be executed in java
	public static void main(String[] args) {
		ConcreteClass obj1 = new ConcreteClass();
		obj1.method1();
		ConcreteClass.method2();
		obj1.method4();
		//---------------------------------------
//		AbstractClass obj2 = new AbstractClass();
		ImplementAbstract obj2 = new ImplementAbstract();
		obj2.method4();
		obj2.method5();
		obj2.method6();
		//---------------------------------------
//		TestInterface obj3 = new TestInterface();
		ImplementInterface  obj3 = new ImplementInterface();
		obj3.method6();
		obj3.method7();
		obj3.method8();
	}
}

