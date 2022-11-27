package wrapperClasses;

public class IntegerClass {

	public static void main(String[] args) {
		int i = 100;
		int j = 200;
		int m = 100;
		int n = 50;
		
		String s = "200";
		
		int k = i+j;
		System.out.println("Addition: "+ k);
		
		// convert int --> String
		String intStr = Integer.toString(i);
		System.out.println("Integer --> String : " + intStr);
		
		String l = i + intStr;
		System.out.println("Addition: "+ l);
		
		// compare two integers	
		int result = Integer.compare(i, j);			// i<j  --> -1
		System.out.println("Comparison between i & j: " + result);
		
		int result1 = Integer.compare(i, m);			// i=j  --> 0
		System.out.println("Comparison between i & m: " + result1);
		
		int result2 = Integer.compare(i, n);			// i>j  --> 1
		System.out.println("Comparison between i & n: " + result2);
		
		//convert string --> int  (parsing= converting one type to another)
		String q = s + i;
		System.out.println("s+i before parsing : " + q);
		int o = Integer.parseInt(s);
		System.out.println("String --> int : " + o);
		int r = o + i;
		System.out.println("s+i after parsing : " + r);
		
		//to equate two integers
		boolean x = (i == j);     // == is comparison operator
		System.out.println("If i = j? : " + x);
		
		boolean y = Integer.valueOf(i).equals(m);   // valueOf(op1).equals(op2) is comparison
		System.out.println("If i = m? : " + y);

	}

}
