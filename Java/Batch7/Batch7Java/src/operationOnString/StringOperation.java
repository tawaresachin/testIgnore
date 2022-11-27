package operationOnString;

public class StringOperation {
	
	String str = "Batch-7";
	String s = "Batch-7";

	public static void main(String[] args) {
		StringOperation obj = new StringOperation();
		System.out.println(obj.str);
		System.out.println(obj.str.toUpperCase());
		System.out.println(obj.str);
		
		StringOperation obj1 = new StringOperation();
		obj1.str = "Testing";
		System.out.println(obj1.str);
	}
}
