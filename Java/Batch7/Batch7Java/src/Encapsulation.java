
public class Encapsulation {
	int i;
	String s;
	float f;
	double d;
	
	//getter -setter methods
	
	public void setI(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}	
	
	//getter- constructor
	public Encapsulation(String s, float f, double d) {
		this.s = s;
		this.f = f;
		this.d = d;
	}
	
	public String getS() {
		return s;
	}	

}
