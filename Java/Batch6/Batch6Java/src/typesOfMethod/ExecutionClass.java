package typesOfMethod;

public class ExecutionClass {
	
	public static void main(String[] args) {
		//Access Non-Static members
		TestClass test = new TestClass();
		test.nonstaticMethod1();						//without args
		test.nonstaticMethod2(1, "Test Candidate-1");  	//with args
		test.nonStaticVariableAccess();
		
				
		//Access static members
		TestClass.staticMethod1();						//without args
		TestClass.staticMethod2(2, "Test Candidate-2");	//with args
		TestClass.staticVariableAccess();
		
		new TestClass().method1();
		TestClass.method2();
	}

}
