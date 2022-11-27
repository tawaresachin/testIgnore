package oopConcepts;

public class OverridingPoly {
	
	public void add(int a, float d) {
		float c = a+d;
		System.out.println("Addition3: "+c );
	}

	public void add(int a, int b, float d) {
		float c = a+b+d;
		System.out.println("Addition4: "+c );
	}	
}

