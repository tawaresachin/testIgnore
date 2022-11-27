package typesOfMethods;

public class OperationOnMethod {
	
	int i = 33;
	static float f = 33.33f;
	
	//Concept of block - default static member of class
	{
		System.out.println("I am block");
	}	

	//Static method 
	public static void staticMethod1() {
		System.out.println("I am static method-1");
	}
	
	//static method with argument & without return
	public static void addition(int a, int b) {
		int c = a+b;
		System.out.println("Addition is: " + c);
	}
	
	//static method with argument & with return
	public static int subtraction(int a, int b) {
		int c = a-b;
		return c;
	}
	
	//static method without argument & with return
	public static String method3() {
		return "Batch-7";
	}
	
	//non-static method
	public void nonStaticMethod1() {
		System.out.println("I am nonstatic method-1");
	}
	
	//non-static method with argument with return
	public int multiplication(int a, int b) {
		int c = a*b;
		return c;
	}
	
	//calling static method inside non-static method is possible
	public void callStaticInNonStatic() {
		addition(100, 99);
		System.out.println(multiplication(3, 3));
		System.out.println("Calling global nonstatic varaible: " + i);
		System.out.println("Calling global static varaible: " + f);
	}
	
	//calling non-static method inside static method is possible
	public static void callNonStaticInStatic() {
//		System.out.println(multiplication(3, 3));
		staticMethod1();
//		System.out.println("Calling global nonstatic varaible: " + i);
		System.out.println("Calling global static varaible: " + f);
	}
	
    //static --> block --> non-static
	public static void main(String[] args) {
		OperationOnMethod.staticMethod1();
		AnotherClass.staticMethod2();
		
		OperationOnMethod.addition(1,2);
		int d = OperationOnMethod.subtraction(3, 1);
		System.out.println("Subtraction is: " + d);
		
		System.out.println(OperationOnMethod.method3());
		
		OperationOnMethod obj = new OperationOnMethod();
		obj.nonStaticMethod1();
					
		int e = obj.multiplication(5, 5);
		System.out.println("Multiplication is: " + e);	
		
		callNonStaticInStatic();
		obj.callStaticInNonStatic();
		
	}
}
