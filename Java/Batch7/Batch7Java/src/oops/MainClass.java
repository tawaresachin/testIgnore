package oops;

public class MainClass {

	public static void main(String[] args) {
		//*******Encapsulation using getter - setter approach ***************
//		Encapsulation enc = new Encapsulation();
//		enc.setterI(20);
//		System.out.println("Value of integer i is: " + enc.getterI());
//		enc.setStr("Batch-7");
//		System.out.println("Value of String str is: " + enc.getStr());
		
		//*******Encapsulation using getter - constructor approach ***********
		Encapsulation enc = new Encapsulation(100, "Testing");
		int x = enc.getI();
		System.out.println("Value of integer i is: " + x);
		String y = enc.getterStr();
		System.out.println("Value of String str is: " + y);
		
		//*******Encapsulation for private method*****************************
		enc.getterTestMethod();
		
		//**************Inheritance- Single level (1 parent --> 1 Child)
		Child1 child1Obj = new Child1();
		System.out.println("variable from parent1 -->" + child1Obj.i);
		System.out.println("variable from child1 -->" + child1Obj.j);
		child1Obj.parent1Method();
		child1Obj.child1Method();
		
		//***************Multi-level inheritance - one to one  (.....grandparent --> parent --> child)
		Child2 child2Obj = new Child2();
		System.out.println("variable from parent1 -->" + child2Obj.i);
		System.out.println("variable from child1 -->" + child2Obj.j);
		System.out.println("variable from child2 -->" + child2Obj.k);
		child2Obj.parent1Method();
		child2Obj.child1Method();
		child2Obj.child2Method();
		
		//*************Hybrid inheritance - many to one (multiple child & single parent)
		Child3 child3Obj = new Child3();
		
		// child1		
		System.out.println("variable from parent1 -->" + child1Obj.i);
		System.out.println("variable from child1 -->" + child1Obj.j);
		child1Obj.parent1Method();
		child1Obj.child1Method();
		child1Obj.child1SuperAccess();
		child1Obj.child1ThisAccess();
		child1Obj.child1StaticAccess();
		
		//child3
		System.out.println("variable from parent1 -->" + child3Obj.i);
		System.out.println("variable from child3 -->" + child3Obj.l);
		child3Obj.parent1Method();
		child3Obj.child3Method();
		
		//********Multiple inheritance -one to many(one child- multiple parents)- not possible -> Diamond ambiguity
		
		//*****Polymorphism - Compile time (Overloading)-decided using compiler , with & without inheritance*********
		
		Overloading ovr = new Overloading();
		ovr.addition(10, 10);
		ovr.addition(10, 10.22f);
		ovr.addition(10, 20, 30);
		ovr.addition(10, 20, 22.22f);
	
		//******Polymorphism - Run time (overriding)- decided using object, compulsory with inheritance *********
		OverridingParent ovrd = new OverridingParent();
		ovrd.addition(10, 20);
		
		//**********Abstraction*******************
//		AbstractClass abs = new AbstractClass();   // cannot create object of abstract class
		AbstractClass abs = new ImplementAbstractClass();
		
		String user = "testuser";
		String password = "testpassword";
		boolean flag = abs.LoginPage(user, password);
		System.out.println("Login status: "+ flag);
		double f = abs.transaction(user, password, 1000);
		System.out.println("Amount transacted: " + f);
	
		ImplementAbstractClass impl = new ImplementAbstractClass();
		impl.testMethod();
		
//		OopsInterface intr = new OopsInterface();    //cannot create object of interface
		OopsInterface intr = new ImplementationOfInterface();
		intr.method1();
		intr.method2();
		System.out.println("Variable in interface is: " + intr.i); // variable in interface is always constant

		ImplementationOfInterface intImpl = new ImplementationOfInterface();
		intImpl.method3();
		
	}
}
