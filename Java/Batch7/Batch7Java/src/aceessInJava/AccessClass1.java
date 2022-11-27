package aceessInJava;

public class AccessClass1 {

	public static void main(String[] args) {
		AccessClass obj = new AccessClass();
		System.out.println(obj.i);				//non-static variables with public modifier in same package
		System.out.println(AccessClass.j);		//static variables with public modifier in same package
		
//		System.out.println(obj.s); 				//non-static variables with private cannot be used outside of class
//		System.out.println(AccessClass.str); 	//static variables with public modifier cannot be used outside of class
		
		System.out.println(obj.d);				//non-static variable with protected access within same package but diff. class
		System.out.println(AccessClass.dbl);	//static variable with protected access within same package but diff. class

		System.out.println(obj.c);
		System.out.println(AccessClass.chr);
		
//		obj.privateMethod();
//		AccessClass.privateMethod1();	
		
		obj.protectedMethod();
		AccessClass.publicMethod1();
		
		obj.defaultdMethod();
		AccessClass.defaultMethod1();
		
	}

}
