package loopsNcontrol;

public class JavaLoops {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		String[] str = {"Apple", "Banana", "Kiwi", "Mango"};
		//----------------for loop----------------
		int cnt = 3;
		for(int i=0;i<cnt;i++) {
			System.out.println("Batch-6");
		}
		
		 int len = str.length;
		 for(int j=0;j<len;j++) {
			 System.out.println(str[j]);
		 }
		//----------------for-each loop----------------
		
		for(String x:str) {
			System.out.println(x);
		}
		//----------------while loop----------------
		int count = 2;
		while(count>0) {
			System.out.println("looping in while loop");
			count--;
		}
		
		//----------------do-while loop----------------
		int count1 = 0;
		do {
			System.out.println("looping in do-while");
			count1--;
		} while(count1>0);
		

	}

}


