package MouseAction.mouse;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Example 
{
	public static void main(String[] args) {
		String str = "Hi12Hello34Hi56";
//		String str1 = str.replaceAll("[^0-9]", "").trim();
//		str1.replaceAll(str, str1)
		Pattern pattern = Pattern.compile("[^0-9]");
		String str1 = pattern.matcher(str).replaceAll("");
		System.out.println(str1);	

	}	
}
