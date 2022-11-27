package wrapperPackage;

public class wrapperClass {
	public static void main(String[] args) {
		int i = 1;
		String s = "10";
		int j = 10;
		int k = 2;
		
		String add = i + s;
		System.out.println(add);
		
		//------------------------Wrapper Class - Integer----------------------------------------
		int add1 = i +Integer.parseInt(s);		// convert string to integer
		System.out.println(add1);
		String str = Integer.toString(i);		// convert integer to string
		System.out.println(str);
		String add2 = Integer.toString(i)+Integer.parseInt(s);
		System.out.println(add2);
		int comp = Integer.compare(i, j);		// if i==j -->0 OR if i>j--> 1 OR if i<j -->-1	
		System.out.println(comp);
		Integer val = Integer.valueOf(i);		// convert primitive data type into object of wrapper class
		boolean flag = val.equals(k);			// equates two integer objects
		System.out.println(flag);
		//------------------------Wrapper Class - Float----------------------------------------
		float f = 20.11f;
		String h = "20.25";
		float l = 88.89f;
		float add3 = f + Float.parseFloat(h);		//convert string to float
		System.out.println(add3);
		String str1 = Float.toString(f);			//convert float to string
		System.out.println("Float to String: "+ str1);
		int comp1 = Float.compare(f, l);            // if f==l -->0 OR if f>l--> 1 OR if f<l -->-1
		System.out.println(comp1);
		Float obj = Float.valueOf(f);
		boolean flag1 = obj.equals(l);
		System.out.println(flag1);
		//------------------------Wrapper Class - Character----------------------------------------
		char c = 'A';
		char ch = 'b';
		String st = "C";
		char chh = 'a';
		String cha = Character.toString(c);			//convert char to String
		System.out.println(cha + st);
		char lc = Character.toLowerCase(c);
		System.out.println(lc);						//convert char to lower case
		char uc = Character.toUpperCase(ch);
		System.out.println(uc);						//convert char to upper case
		Character obj3 = Character.valueOf(c);		//convert char to object
		boolean flag2 = obj3.equals(chh);			//equate two chars
		System.out.println(flag2);
		//------------------------Wrapper Class - Double----------------------------------------
		double dd = 100.10;
		String sd = "66.84";
		double dd2 = 100.10;
		double dd1 = Double.parseDouble(sd);		//string to double
		System.out.println(dd +dd1);
		String sdd = Double.toString(dd);			//double to String
		System.out.println("Double to String: "+ sdd);
		int cd = Double.compare(dd, dd2);          // if dd==dd2 -->0 OR if dd>dd2--> 1 OR if dd<dd2 -->-1
		System.out.println(cd);
		Double od = Double.valueOf(dd);				//double to object
		boolean flag3 = od.equals(dd2);				//equate two doubles
		System.out.println(flag3);
		//------------------------Wrapper Class - Boolean----------------------------------------
		boolean bool = true;
		String sb = "false";
		String bs = Boolean.toString(true);
		System.out.println(bs);
		boolean cb = Boolean.parseBoolean(sb);
		System.out.println(bool && cb);
		

	}

}
