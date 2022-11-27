
public class MainClass {

	public static void main(String[] args) {
		
		TestLambda test = new TestLambda();
		TestInterface testInf = ()->{System.out.println("testLambda implemented");};
		lambda(testInf);
//		lambda(()->{
//			System.out.println("testLambda implemented");
//		});
	}
	
	static void lambda(TestInterface tst) {
		tst.testLambda();
	}
}


