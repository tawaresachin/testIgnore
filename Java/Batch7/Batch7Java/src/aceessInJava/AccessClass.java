package aceessInJava;

public class AccessClass {
	
	public int i = 20;					//accessible over whole project - all package & all classes
	public static int j = 30;
	
	private String s = "Batch-7";		//accessible only within the same class
	private static String str = "Testing";
	
	protected double d = 20.22;			//accessible within the same package but can be inherited
	protected static double dbl = 55.55;
	
	char c = 'A';						//accessible only within the same package 
	static char chr = 'B';
	
	final boolean flag = true;
	final static boolean flag1 = false;
	
	public void publicMethod() {
		System.out.println("I am non-static public method");
	}
	
	public static void publicMethod1() {
		System.out.println("I am static public method-1");
	}
	
	private void privateMethod() {
		System.out.println("I am non-static private method");
	}
	
	private static void privateMethod1() {
		System.out.println("I am static private method-1");
	}
	
	protected void protectedMethod() {
		System.out.println("I am non-static protected method");
	}
	
	protected static void protectedMethod1() {
		System.out.println("I am static protected method-1");
	}
	
	void defaultdMethod() {
		System.out.println("I am non-static default method");
	}
	
	static void defaultMethod1() {
		System.out.println("I am static default method-1");
	}
	
	final public void publicFinal() {
		System.out.println("I am public final method");
	}
	
	final public static int publicFinal1() {
		System.out.println("I am public static final method-1");
		return 10;
	}	

	public static void main(String[] args) {
		AccessClass obj = new AccessClass();
		System.out.println(obj.s);
		System.out.println(AccessClass.str);
		obj.publicMethod();
		AccessClass.publicMethod1();
		obj.privateMethod();
		AccessClass.privateMethod1();
		obj.defaultdMethod();
		AccessClass.defaultMethod1();
		
//		obj.flag = false;
//		AccessClass.flag1= false;

	}

}
