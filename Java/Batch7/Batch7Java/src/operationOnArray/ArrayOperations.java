package operationOnArray;

public class ArrayOperations {

	public static void main(String[] args) {
		int[] intArray = new int[5];
//		int intArray[] = new int[5];   // fashion like procedural language e.g. C
		intArray[0] = 100;
		intArray[1] = 1;
		intArray[2] = 200;
		intArray[3] = 3;
//		intArray[4] = "Batch-7";   // cannot insert elements other than defined data types
		intArray[4] = 102;
//		intArray[5] = 2;		
//		System.out.println(intArray[5]);    //element greater than defined size is not allowed

		float[] floatArray = {10.21f, 100.2f, 200.31f};
		System.out.println("Element in floatArray at [0]: " + floatArray[0]);
		
		// One-dimentional array  e.g. strArray={"One", "Two", "Three"}
		String[] strArray = new String[3];
		strArray[0] = "One";
		strArray[1] = "Two";
		strArray[2] = "Three";
		
		System.out.println("Element in strArray at [1]: "+ strArray[1]);
		
		//Multi-dimentional array  e.g. dblArray = {100.1, 22.33}
//												   {445.22, 22.99}
		double[][] dblArray = new double[2][2];
		dblArray[0][0] = 100.1;
		dblArray[0][1] = 22.33;
		dblArray[1][0] = 445.22;
		dblArray[1][1] = 22.99;
		
		System.out.println("Element in dblArray at [1][0]: " + dblArray[1][0]);		

	}

}
