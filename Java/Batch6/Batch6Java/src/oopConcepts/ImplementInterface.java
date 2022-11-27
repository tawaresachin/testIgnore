package oopConcepts;

public class ImplementInterface implements InterfaceClass  {
	
	public void drawMoney(long money) {
		System.out.println("Drwaing rupees:" +money);
	};
	
	public void depositMoney(long money) {
		System.out.println("Depositing rupees:" +money);
	};
	public void showStatement() {};
}
