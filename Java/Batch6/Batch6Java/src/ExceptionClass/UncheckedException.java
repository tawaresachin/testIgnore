package ExceptionClass;
import java.io.File;
import java.io.FileInputStream;
public class UncheckedException {
	//*************re-throw exception*******************
	public void division() {
		try {
			int div = 1/0;
			System.out.println(div);			
		}catch (Exception e) {
			throw e;			//re-throw the exception
		}}
	public static void main(String[] args) {
		try {		
		//*********ArithmaticException********
		int div = 1/1;
		System.out.println(div);		
		//*********ArrayIndexOutOfBoundsException********
		int[] arr = {0,1,2,3};
		for(int i=0;i<=4;i++) {
			System.out.println(arr[i]);	}
		//*********StringIndexOutOfBoundsException********
		String str = "Batch#6";
		char ch = str.charAt(7);
		System.out.println(ch);			
		//*********Handling checked exceptions using try-catch********
		File file = new File("src/ExceptionClass/sample.txt");
		FileInputStream input = new FileInputStream(file);
		String str1 = new String (input.readAllBytes());
		System.out.println(str1);		
		//*********Handling re-thrown exception explicitly********
		UncheckedException exp = new UncheckedException();
		exp.division();
		}
		//*************using multiple catch blocks for specific exceptions*******************
//		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}catch(ArrayIndexOutOfBoundsException e1) {
//			System.out.println(e1.getMessage());
//			e1.printStackTrace();
//		}catch(StringIndexOutOfBoundsException e2) {
//			System.out.println(e2.getMessage());
//			e2.printStackTrace();
//		}
		//*************using one catch for general exception*******************
		catch (Exception e3) {
			System.out.println(e3.getMessage());
			e3.printStackTrace();		
		}
		//*************Finally block for cleanup operations*******************
		finally {
			System.out.println("I am finally");
		}
	}
}
