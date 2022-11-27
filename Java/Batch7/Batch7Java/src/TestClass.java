
public class TestClass {
	static int k =200;

	public static void main(String[] args) {
	k += 2;   //k = k+2;
	System.out.println("Value of k is: " + k);
	
	// I will be back in 2 min....
	
//	Oops obj = new Oops();
	Oops obj1 = new Implementation();
	Implementation obj2 = new Implementation();
	obj1.method2();
	
	TestInterface obj3 = new IntrfcImplements();
	obj3.test1();
	obj3.test2();
	
	IntrfcImplements obj4 = new IntrfcImplements();
	obj4.test1();
	obj4.test2();
	obj4.test3();
	
//	obj3.i = 20;
	
	Encapsulation obj = new Encapsulation("Sachin", 22.22f, 33.23d);
	System.out.println(obj.s);
	System.out.println(obj.f);
	System.out.println(obj.d);
	
	
	

	}

}
