package stringOperation;

public class StringTest {
	// String variables pointing to same content (same memory)
	String s = "Sample";
	String t = "Sample";
	
	//String object pointing to different content (different memory)
	String obj1 = new String("Sample");
	String obj2 = new String("Sample");
	
	public void testString() {
		if(s==t) {
			System.out.println("s & t are pointing to same memory location");
		} else {
			System.out.println("s & t are not pointing to same memory location");
		}
		
		if(obj1==obj2) {
			System.out.println("obj1 & obj2 are pointing to same memory location");
		} else {
			System.out.println("obj1 & obj2 are not pointing to same memory location");
		}
		
		String u =  s.toUpperCase();
		System.out.println("String s after operation on it : " + u);
		System.out.println("If String s still immulatble? : " + s);
	}

	public static void main(String[] args) {
		
		StringTest test = new StringTest();
		test.testString();
	
		

	}

}
