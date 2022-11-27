package oopConcepts;

public abstract class AbstractClass {
	
	public abstract void drawMoney(long money);
	
	public void depositMoney(long money) {
		System.out.println("Deposited Rupees: "+money);
	};

}
