package operationOnArray;

import java.util.Arrays;

public class ArraysClassMethods {

	public static void main(String[] args) {
		int[] intArr = new int[5];
		intArr[0] = 10;
		intArr[1] = 5;
		intArr[2] = 7;
		intArr[3] = 20;
		intArr[4] = 0;
		
		int[] intArrx = new int[5];
		intArrx[0] = 10;
		intArrx[1] = 5;
		intArrx[2] = 7;
		intArrx[3] = 20;
		intArrx[4] = 0;
		
		float[] floatArr = new float[5];
		floatArr[0] = 100.23f;
		floatArr[1] = 0.23f;
		floatArr[2] = 5.55f;
		floatArr[3] = 122.33f;
		floatArr[4] = 44.56f;
		
		//to get length of array
		int size = intArr.length;
		System.out.println("Lenght of intArr is: " + size );
		
		//to convert array into String
		String str = Arrays.toString(intArr);
		System.out.println("Coverting array into String: " + str);
		
		//to Sort array in ascending order
		 Arrays.sort(intArr);
		for(int i=0; i<size; i++) {
			System.out.println("Element in intArr at " + i + " is: " + intArr[i]);
		}
		
		//to sort within range of specific indices (startIndex to endIndex+1) (parallel sort)
		Arrays.parallelSort(floatArr,2,5);
		for(int j=0; j<floatArr.length; j++) {
			System.out.println("Element in floatArr at " + j + " is: " + floatArr[j]);
		}
		
		//to search index of desired element 
		int index = Arrays.binarySearch(floatArr, 5.55f);
		System.out.println("Index of 50.55f from floatArr is: " + index);
		
		//to check equality of two arrays
//		Arrays.equals(intArr, floatArr);    // to check equality both arrays should have same data type
		Arrays.sort(intArrx);
		boolean flag = Arrays.equals(intArr, intArrx);
		System.out.println("If intArr is same as intArrx?: " + flag);

	}

}
