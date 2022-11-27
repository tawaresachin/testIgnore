package oopConcepts;

public class OverloadingPoly extends OverridingPoly{
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Addition1: "+c );
	}
	
	public void add(int a, int b, float d) {
		float c = a+b+d;
		System.out.println("Addition2: "+c );
	}

}

