package loopsAndControlStatements;

public class ControlStatements {
	
	public static void chooseColor(int b) {
		switch(b) {
		case 0:
			System.out.println("Red");
			break;
		case 1:
			System.out.println("Orange");
			break;
		case 2:
			System.out.println("Yellow");
			break;
		case 3:
			System.out.println("Green");
			break;
		case 4:
			System.out.println("Blue");
			break;
		case 5:
			System.out.println("White");
			break;
		case 6:
			System.out.println("Purple");
			break;
		default:
			System.out.println("Black");
			break;
		}
	}

	public static void main(String[] args) {
		int[] arr = {11,21,31,14,5};
		
		// control statement if-else (condition & alternate block)
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 4) {
				System.out.println("I got what i want!");
			} else {
				System.out.println("Element of array: " + arr[i]);
			}
			System.out.println("Next....");
		}
		
		// if (single condition)
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 4) {
				System.out.println("I got what i want!");
			}
			System.out.println("Element of array: " + arr[i]);
		}
		
		//nested if	(condition within condition)
		for(int i=0; i<arr.length; i++) {
			if(i == 3) {
				if(arr[i] > 3) {
					System.out.println("The number at arr[" +i + "] > 3");
				}
			}
			System.out.println("Element of array: " + arr[i]);
		}
		
		// else-if (alternate condition)
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 4) {
				System.out.println("I got 4");
			} else if(arr[i] == 31) {
				System.out.println("I got 31");
			}
			System.out.println("Element of array: " + arr[i]);
		}
		
		// break (to break out from the loop)
		int k = 0;
		while(true) {
			System.out.println("Number: " + k);
			k++;
			if(k == 11) {
				break;
			}
		}
		
		for(int m=0; m<100 ; m++) {
			System.out.println("Number in for loop: " + m);
			if(m == 12) {
				break;
			}
		}
		
		//continue (step-over the iteration)
		for(int a =0; a<20; a++) {
			if (a == 12) {
				continue;
			}			
			System.out.println("The number is: " + a);
			}
		
		// switch -case-default
		chooseColor(100); 
	}
}
