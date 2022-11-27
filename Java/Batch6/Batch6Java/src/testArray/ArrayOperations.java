package testArray;

import java.util.Arrays;

public class ArrayOperations {

	public static void main(String[] args) {
		
		//Single dimension array
		int[] intArr = new int[3];							//java style
		float floatArr[] = new float[10];					// C-style
		char[] charArr = {'t','e','s','t','i','n','g'};		//with definition
		
		intArr[0]=0;
		intArr[1]=1;
		intArr[2]=2;
		
		//multi dimension array
		int[][] arrMulti = new int[2][2];				//row-column  0 1
		arrMulti[0][0]= 0;                              //            2 3
		arrMulti[0][1]= 1;
		arrMulti[1][0]= 2;
		arrMulti[1][1]= 3;
		
		//-------------How to print 1D array?------------------
		System.out.println(intArr);
		
		int length = intArr.length;
		for(int i=0; i<length ;i++) {
		 System.out.println(intArr[i]);
		}
		//-------------How to print 2D array?------------------
		int row = arrMulti.length;
		System.out.println("Row count: "+row);
		int col = arrMulti[0].length;
		System.out.println("Column count: "+col);
		
		for(int i =0; i<row; i++) {
			for (int j=0; j<col; j++) {
				System.out.print(arrMulti[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		//-------------------Arrays Class--------------------
		String strArr = Arrays.toString(intArr);
		System.out.println(strArr);
		String strArr1 = Arrays.toString(charArr);
		System.out.println(strArr1);
		Arrays.sort(charArr);
		System.out.println(charArr);
		Arrays.parallelSort(charArr,1,6);  // sorting between given indices
		System.out.println(charArr);
		int[] intArr1 = {3,1,6,8};
		int[] intArr2 = {3,1,6,8};
		int ind = Arrays.binarySearch(intArr1,1);
		System.out.println("Index of 1: "+ ind);
		boolean flag = Arrays.equals(intArr1, intArr2);
		System.out.println("If intArr1 & intArr2 are equal?: "+flag);
	}
}
