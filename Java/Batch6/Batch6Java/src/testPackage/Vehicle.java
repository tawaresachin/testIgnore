package testPackage;

public class Vehicle {
	//Instance Variables
	private int price = 1000000;
	String brand = "Hyundai";
	//Class/Static variables
	static final double GST = 22.003;

	public int sedan() {
		System.out.println(brand);
		System.out.println(price);
		return price;
	}
	
	//Scope = Only within same class, Memory Usage = Object memory
	private void hatchBack() {
		//Method/Local variables
		float interestRate = 7.5f;
		System.out.println(interestRate);
	}
	
	//Scope = within any class of same package only, Memory Usage = Object memory
	void testMethod() {
		System.out.println("I am test method");
	}
	
	//Scope = only within same package but can be accessed by inheritance, Memory Usage = Object memory
	protected void testMethod2() {
		System.out.println("I am test method2");
	}
	
	//Scope = anywhere in project, Memory Usage = Class memory
	public static void testMethod3() {
		System.out.println("I am test method3");
	}
	
	//Scope = anywhere in project, Memory Usage = Class memory
	public static void testMethod4() {
		System.out.println("I am test method4");
	}
	
	public static void main(String[] args) {
		//Object holds space for executing instance variables
		Vehicle obj = new Vehicle(); //DataType_Class ObjectName = reserve_memory Constructor
		obj.hatchBack();
		int cost = obj.sedan();
		System.out.println(obj.brand);
		System.out.println(cost);
		//For static variables, static space of class is directly being used
		System.out.println(Vehicle.GST);
		System.out.println(GST);
		testMethod3();
		Vehicle.testMethod3();
//		obj.GST = 100.22;
		System.out.println("New GST :" + GST);
	}
}

