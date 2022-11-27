package constructorAndObjects;

public class ConceptOfConstructor {
	
	int a;
	int c;
	float f = 33.33f;
	float m;
	static String str = "Batch-7";
	
	public void nonStaticMethod() {
		System.out.println("Integer: " + a);
	}
	
	public ConceptOfConstructor() {				//user defined constructor without argument (without any return type)
		a = 100;								//to initialize non-static members
//		static boolean flag = true;				// cannot initialize new static member
//		str = "testing";						// not recommended to re-initialize global static member
	}	

	public ConceptOfConstructor(int i, int j) {	//user defined constructor with argument			
		c = i + j;								//to perform operation on arguments
		System.out.println("Addition: " + c);
	}
	
	private ConceptOfConstructor(int i, float j) {	//user defined constructor with argument			
		m = i + j;								//to perform operation on arguments
		System.out.println("Atrithmatic operation: " + m);
		
		ConceptOfConstructor obj = new ConceptOfConstructor();
		obj.nonStaticMethod();
		
		ConceptOfConstructor obj1 = new ConceptOfConstructor(20, 20);
		obj1.nonStaticMethod();
		
	}

	public static void main(String[] args) {
		ConceptOfConstructor obj = new ConceptOfConstructor();  //default constructor (when no user defined constructor present in class)
		System.out.println("Float: " + obj.f );
		obj.nonStaticMethod();
//		System.out.println("String: " + obj.str);   // not recommended to call static member using object
		
		ConceptOfConstructor obj1 = new ConceptOfConstructor(10, 30);   // user defined constructor with args
		obj1.nonStaticMethod();
		
		ConceptOfConstructor obj2= new ConceptOfConstructor(10, 10.22f);
		
	}

}