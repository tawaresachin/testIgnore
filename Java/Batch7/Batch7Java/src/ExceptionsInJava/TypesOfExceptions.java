package ExceptionsInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TypesOfExceptions {
	// Error --> 1. compile time error  2. run time error/Exception 3. Logical error

	// Exception = runtime error
	public static void main(String[] args) throws FileNotFoundException{
//		int i  // compile time error 
		
		//checked exception - exceptions checked at compile-time only but can occur only at runtime
		FileInputStream input = new FileInputStream("C:\\Users\\Sachin Taware\\Desktop\\test.txt");
		
		//unchecked exception - exception caught at runtime only
		int i = 100/0;				//Logical error 
		System.out.println("Division: "+i);
	}
}
