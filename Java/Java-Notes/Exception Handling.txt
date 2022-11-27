package ExceptionsInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.management.InvalidAttributeValueException;

public class ExceptionHandling {

	
	public static void main(String[] args) throws IOException {
		// checked exceptions --> Exceptions those java can interpret
		//Handling Exception using throws clause --> handling checked exception
		File file = new File("C:\\Users\\Sachin Taware\\Desktop\\test1.txt");  // Entity --> file
		FileInputStream input = new FileInputStream(file);  // File --> Byte
		byte[] bytes = input.readAllBytes(); // to read all bytes in stream 
		String str = new String(bytes);  // byte stream --> string
		System.out.println(str);
		input.close();
		
		// Unchecked exceptions --> Exceptions those java cannot interpret
		//Handling Unchecked Exceptions
		int[] arr = {1,2,3};
		FileInputStream input1 = null;
		try {
			
			// to generate ArrayIndexOutOfBoundsException
			for(int i =0 ; i <3; i++) {
				System.out.println(arr[i]);
			}
			
			// to generate ArithmeticException
			int k = 100/2;
			
			// to generate StringIndexOutOfBoundsException 
			String st = "Test";
			char c = st.charAt(3);
			
			// to generate fileNotFoundException
			File file1 = new File("C:\\Users\\Sachin Taware\\Desktop\\test1.txt");
			input1 = new FileInputStream(file1);
			if(input1.readAllBytes()!= null) {
				System.out.println("File is not empty");
			}else {
				System.out.println("File is empty");
			}
			
			// throw clause --> for custom exception
			if(!str.contains("Happy")) {
				throw new InvalidAttributeValueException("This is not valid string");   // throw --> to throw exception explicitly by user
			}
			
		}catch(Exception e) {			// Exception --> generic parent class to catch any exception
			e.printStackTrace();
		}
		
//		catch(ArrayIndexOutOfBoundsException e1){    // Specific exception class
//			e1.printStackTrace();
//		}catch(ArithmeticException  e2) {
//			e2.printStackTrace();
//		}catch(nullPointerException  e3) {
//		e3.printStackTrace();
//		}catch(StringIndexOutOfBoundsException  e4) {
//		e4.printStackTrace();
//	}		
		finally {		// cleanup operations
			System.out.println("This is compulsory executed");
			input1.close();
		
		}

		
	}

}
