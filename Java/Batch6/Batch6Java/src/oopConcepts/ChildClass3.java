package oopConcepts;

public class ChildClass3 extends ParentClass{
	String st = "OOPS";
	static char chr ='D';
	
	
	public void child3Method() {
		System.out.println("Method of ChildClass3");
	}
	
	public void useOfThis() {
		System.out.println("Integer from any class: "+ this.i);
	}
	
	public void useOfSuper() {
		System.out.println("String from parent class: "+ super.str);
	}
	
	public void staticAccess() {
		System.out.println("Static variable from parent class: "+ chr);
	}

}
