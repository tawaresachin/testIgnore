package operationOnString;

public class MethodsOfStringClass {

	public static void main(String[] args) {
		String str1 = "Batch-7";
		String str2 = " Java Class";
		String str3 = "Batch-7";
		String str4 = "BATCH-7";
		String str7 = "Java";
		String str8 = "testing class";
		String str11 = "";
		String str12;    // if String variable is not initialized, it's value is null default
		String str13 = "                ";
		
		//length of the string
		int length1 = str1.length();
		int length2 = str2.length();
		System.out.println("Lenght of str1=" + length1);
		System.out.println("Lenght of str2=" + length2);
		
		//check equality
		boolean flag1 = str1.equals(str2);
		boolean flag2 = str1.equals(str3);
		boolean flag3 = str1.equals(str4);
		System.out.println("If str1=str2? " + flag1);
		System.out.println("If str1=str3? " + flag2);
		System.out.println("If str1=str4? " + flag3);
		
		//check equality ignoring case
		 boolean flag4 = str1.equalsIgnoreCase(str4);
		 System.out.println("If str1=str4 ignoring case? " + flag4);
		 
		//concat multiple strings
		 String str5 = str1 + str2;
		 String str6 = str1.concat(str2);
		 System.out.println(str5);		
		 System.out.println(str6); 
		 
		 //split the String
		 String[] arr = str1.split("-");
		 System.out.println("Lenght of String array= " + arr.length);
		 System.out.println("String at arr[0] = " + arr[0]);
		 System.out.println("String at arr[1] = " + arr[1]);
		 
		 //check character at certain index in String
		 char c = str1.charAt(6);
		 System.out.println("Character at index 6 from str1 = " + c);		 
		 
		 //index of certain character in String
		 int firstIndex = str2.indexOf('a');
		 System.out.println("First index of 'a'= " + firstIndex);
		 int lastIndex = str2.lastIndexOf('a');
		 System.out.println("Last index of 'a'= " + lastIndex);
		 
		 //check if one string contains another
		 boolean flag5 = str2.contains(str7);
		 System.out.println("If str7 is part of str2?: " + flag5);
		 
		 //convert string to upper case
		 String str9 = str8.toUpperCase();
		 System.out.println("Upper case for str8: " + str9);
		 
		//convert string to lower case
		 String str10 = str4.toLowerCase();
		 System.out.println("Lower case for str4: " + str10);
		 
		//check if string starts with/ends with certain set of characters
		 boolean flag6 = str8.startsWith("test");
		 System.out.println("If str8 starts with 'test'?: " + flag6);
		 boolean flag7 = str8.endsWith("batch");
		 System.out.println("If str8 ends with 'batch'?: " + flag7);
		 
		 //check if string is empty (means no character)
		 boolean flag8 = str11.isEmpty(); 
		 System.out.println("If str11 is empty?: " + flag8);
		 boolean flag9 = str13.isEmpty();
		 System.out.println("If str13 is empty?: " + flag9);
		 
		//check if string is blank (means no character other than space)
		 boolean flag10 = str13.isBlank();
		 System.out.println("If str13 is blank?: " + flag10);
		 
		 // replace certain set of characters in the String
		 String str14 = str8.replace("testing", "Java");
		 System.out.println("New String is: " + str14);
		 
		 //extract sub-string within certain range of index (i.e startIndex to lastIndex-1)
		 String str15 = str8.substring(8, 13);
		 System.out.println("Extracted string from index 7 to 12 is:" + str15);
		 
		 //to convert the string into character array
		char[] charArray = str8.toCharArray();
		System.out.println("0-th element of array charArray is: " + charArray[0]);
		System.out.println("12-th element of array charArray is: " + charArray[12]);
	}
}
