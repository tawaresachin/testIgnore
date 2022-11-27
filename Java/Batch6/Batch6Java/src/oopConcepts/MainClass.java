package oopConcepts;

public class MainClass {

	public static void main(String[] args) {
		
//		EncapsulationConcept enc = new EncapsulationConcept(10, "Batch#6");
		EncapsulationConcept enc = new EncapsulationConcept();
		enc.setter(10, "Batch#6");
		System.out.println(enc.getterInt());
		System.out.println(enc.getterString());
		//Single level Inheritance
		Child1Class child1 = new Child1Class();
		child1.child1Method();
		child1.parentMethod();
		System.out.println("Child class variable: "+ child1.f);
		System.out.println("Parent class variable: "+ child1.i);		
		//Multi-level inheritance
		ChildClass2 child2 = new ChildClass2();
		child2.parentMethod();
		child2.child1Method();
		child2.child2Method();		
		//Hybrid inheritance
		ChildClass3 child3= new ChildClass3();
		child3.parentMethod();
		child3.child3Method();
		child1.child1Method();
		child1.parentMethod();		
		//Mutiple Inhertance --> not possible due to diamond ambiguity		
		//Accessing variables
		child3.useOfThis();
		child3.useOfSuper();
		child3.staticAccess();		
		//Polymorphism- Overloading/compile-time poly-morphism/early-binding
		OverloadingPoly poly = new OverloadingPoly();
		poly.add(10, 20);
		poly.add(10, 20, 30.30f);
		poly.add(10, 20.20f);
		//Polymorphism- Overriding/run-time poly-morphism/late-binding
		poly.add(10, 20, 30.30f);
		OverridingPoly poly1 = new OverridingPoly();
		poly1.add(10, 20, 30.30f);		
		//Abstraction- using Abstract Class
//		AbstractClass abst = new AbstractClass();
		ImplementAbstract abst = new ImplementAbstract();
		abst.depositMoney(25000);
		abst.drawMoney(250);
		//Abstraction- using Interface
//		InterfaceClass intf = new InterfaceClass();
		InterfaceClass intf = new ImplementInterface();
		intf.depositMoney(35000);
		intf.drawMoney(3500);
		intf.showStatement();	
//		intf.i=100;     //variables inside of interface are default static & final
	}
}

