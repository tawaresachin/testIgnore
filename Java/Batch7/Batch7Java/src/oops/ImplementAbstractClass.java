package oops;

public class ImplementAbstractClass extends AbstractClass {  //Inheritance
	int i =100;
	static int j = 100;
	static final int k =100;
	
	//implementing abstract method from abstract class
	@Override			//annotation - to indicate this method is being overrided
	public double transaction(String user, String password, double amount) {
		if(LoginPage(user, password)) {
		double money = amount;
		return money;
		} else {
			System.out.println("Invalid credentials");
			return 0;
		}
	}
	
	public void testMethod() {
		System.out.println("I am test method");
	}
}
