package loopsAndControlStatements;

public class Loops {

	public static void main(String[] args) {
		// For loop (intial condition, final condition, increment/decrement)
		for(int i = 0; i < 11; i++) {
			int count = i;
			System.out.println("The value on " + i +"th iteration is: " + count);
		}
		
		for(int i = 10; i > -1; i--) {
			int count = i;
			System.out.println("The value on " + i +"th iteration is: " + count);
		}
		
		//For- each loop
		int[] arr = {1,2,3,4,5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Array value at arr[" + i +"] : " + arr[i]);
		}
		
		for(int x : arr) {
			System.out.println("Array value at arr: " + x);
		}
		
		// while loop
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int j = 0;
		
		while(true) {
			if(arr1[j] == 7) {
				System.out.println("The value in array is: " + arr1[j]);
				break;
			}
			
			System.out.println("The value in array is: " + arr1[j]);
			j++;
		}
		
		//do -while loop
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		int k = 0;
		
		do {
			System.out.println("The value in array is: " + arr2[k]);
			k++;
		}while(arr2[k] != 7);		
	}
}
