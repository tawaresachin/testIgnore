package accessPackage;

import testPackage.Vehicle;

public class AccessTest extends Vehicle {

	public static void main(String[] args) {
		Vehicle obj1 = new Vehicle();
//		obj1.hatchBack();
		obj1.sedan();
		Vehicle.testMethod3();
		Vehicle.testMethod4();
		
		AccessTest obj3 = new AccessTest();
		obj3.testMethod2();
	}

}

