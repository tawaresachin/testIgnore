package oops;

public class Child1 extends Parent1{
	int j = 200;
	static String str = "Batch-7";
	
	public void child1Method() {
		System.out.println("I am child-1 method");
	}
	
	// to access super class members in subclass -> Keyword = super
	public void child1SuperAccess() {
		System.out.println("I am super class variable: " + super.i);
	}
	
	// to access same class non-static variable without object -> Keyword= this
	public void child1ThisAccess() {
		System.out.println("I am this class variable: " + this.j);
	}
	
	// to access same class static variable -> Classname.variablename
	public void child1StaticAccess() {
		System.out.println("I am static variable of current class: " + Child1.str);
	}
}
