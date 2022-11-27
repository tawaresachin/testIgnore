package ExceptionClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions {

	public static void main(String[] args) throws IOException {
		File file = new File("src/ExceptionClass/sample.txt");
		FileInputStream input = new FileInputStream(file);
		String str = new String (input.readAllBytes());
		System.out.println(str);
	}
}

