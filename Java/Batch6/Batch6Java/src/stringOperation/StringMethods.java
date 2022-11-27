package stringOperation;

public class StringMethods {
	

	public static void main(String[] args) {
		String a = "Manual Testing";
		String b = "Automation Testing";
		String c = "manual testing";
		String d = " Class";
		String z = "";
		String y = " ";
		String w = "Manual Testing Class";
		//--------------------------------------------
		int l = a.length();
		int m = b.length();
		System.out.println("Length of String a: " + l);
		System.out.println("Length of String b: " + m);
		//--------------------------------------------
		boolean flag = a.equals(b);
		boolean flag1 = a.equals(c);
		System.out.println("a=b?: "+flag);
		System.out.println("a=c?: "+flag1);
		//--------------------------------------------
		boolean flag3 = a.equalsIgnoreCase(c);
		System.out.println("a=c? ignoring case: "+flag3);
		//--------------------------------------------
		String e = a + d;
		System.out.println("Concat a & b using + operator: " + e);
		String f = b.concat(d);
		System.out.println("Concat a & b using 'concat()' method: " + f);
		//--------------------------------------------
		String g = c.toUpperCase();
		System.out.println(g);
		//--------------------------------------------
		String h = b.toLowerCase();
		System.out.println(h);
		//--------------------------------------------
		String[] arr = a.split(" ");
		int len = arr.length;
		System.out.println("Lenght of array: " + len);
		System.out.println("First part: " + arr[0]);
		System.out.println("Second part: " + arr[1]);
		//--------------------------------------------
		char ch = a.charAt(5);
		System.out.println("Character at index 5: " + ch);
		//--------------------------------------------
		boolean flag4 = a.startsWith("Ma");
		boolean flag5 = b.startsWith("Ma");
		System.out.println("a is starting with Ma ?: " + flag4);
		System.out.println("b is starting with Ma ?: " + flag5);
		//--------------------------------------------
		boolean flag6 = a.endsWith("ing");
		System.out.println("a is ending with ing ?: " + flag6);
		//--------------------------------------------
		boolean flag7 = a.isEmpty();
		boolean flag8 = z.isEmpty();
		boolean flag9 = y.isBlank();
		System.out.println("String a is empty?: " + flag7);
		System.out.println("String z is empty?: " + flag8);
		System.out.println("String y is blank?: " + flag9);
		//--------------------------------------------
		int firstIndex = a.indexOf('a');
		System.out.println("First Index of 'a' in String a: " + firstIndex);
		int lastIndex = w.lastIndexOf('a');
		System.out.println("Last Index of 'a' in String w: " + lastIndex);
		//--------------------------------------------
		boolean flag10 = w.contains(d);
		System.out.println("If w contins d?: " + flag10);
		//--------------------------------------------
		String v = w.replace("Class", "is important");
		System.out.println(v);
		//--------------------------------------------
		String u = w.substring(5,14);
		System.out.println(u);
		
		//-------------How to reverse a String?---------------
		int length = w.length();
		String t ="";
		for(int i=length-1;i>=0;i-- ) {
			t = t+w.charAt(i);
		}
		System.out.println(t);		
	}

}
