package variablesAndDatatypes;

public class TypesOfVariables {
	static int j = 30;  //class variable or static variable, scope over class
	int h = 40;			//non-static or instance variable, multiple copy possible, uses object memory
						//original copy of non-static variable
	
	public void local() {
		int i = 100;  //Local variable, scope is inside method, uses object memory
		System.out.println(i);
		System.out.println(TypesOfVariables.j);
		int h = 50;
		System.out.println(h);
	}

	public static void main(String[] args) {
		//*************Local Variables***************************************************
		int k = 20; 				//Local variable, scope is inside method
		System.out.println(k);
		int h =99;
		System.out.println(j);		// priority goes to local variable
		
		//*************Instance Variables***************************************************
		TypesOfVariables obj = new TypesOfVariables();  // object or instance
		TypesOfVariables obj1 = new TypesOfVariables();
		TypesOfVariables obj3 = new TypesOfVariables();
		obj.h = 45;				//creating copy-1 of non-static variable
		obj1.h = 65;			//creating copy-2 of non-static variable
		
		System.out.println(obj3.h);		//copy-2 of non-static variable
		System.out.println(obj.h);		//copy-3 of non-static variable
		System.out.println(obj1.h);		//copy-1 of non-static variable
		obj.local();
		
		//*************Static Variables***************************************************
		System.out.println(j);			//local static variable accessible anywhere in  same class
		j=55;							//static variable override - only one copy
		System.out.println(j);
		
		//*************access from another class***************************************************
		System.out.println(TypesOfVariables2.l);   			//static variable from another class
		TypesOfVariables2 obj2 = new TypesOfVariables2();   //object of another class
		System.out.println(obj2.m);							//non-static variable from another class

	}
}