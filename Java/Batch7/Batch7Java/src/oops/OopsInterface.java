package oops;

public interface OopsInterface {
	// 100% abstraction --> all methods are by default abstract
	// cannot write any complete method
	
	int i = 100;		// variable declared in interface is by default public, static & final (i.e. constant)

	public abstract void method1();
	
	public void method2();		// abstract keyword is not compulsory

}
