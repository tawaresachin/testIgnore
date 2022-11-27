package controlStatements;

public class ControlStatementTest {

	public static void main(String[] args) {
		int count = 9;		
		//----------------if-else----------------
		if(count>0) {
			System.out.println("counting: "+count);
		} else {
			System.out.println("count=<0");
		}		
		//----------------nested-if----------------
		if(count>2) {								//condition within condition
			System.out.println("count>2");
			if(count>0) {
				System.out.println("count>0");
			}
		}		
		//----------------else if----------------		
		if(count>2) {								//condition after the condition
			System.out.println("count>2");
		} else if(count>1){
			System.out.println("count>1");
		} else if(count ==0) {
			System.out.println("count=0");
		}		
		//----------------switch-case-default----------------		
		String fruit = "Kiwi";
		switch(fruit) {
		case "Orange": System.out.println("It is soar");
		break;
		case "Banana": System.out.println("It is sticky");
		break;
		case "Mango": System.out.println("It is tastey");
		break;
		case "Pinapple": System.out.println("Make a juice of it");
		break;
		default: System.out.println("You should not eat any fruit");  //mandatory
		}		
		//----------------break statement----------------
		while(count>1) {
			System.out.println("count: "+count);
			count--;
			if(count==3) {
				break;													//break out of the loop
			}
		}		
		//----------------continue statement----------------
		int cnt = 9;		
		while(cnt>0) {		
			if(cnt==6) {
				cnt--;
				continue;												//continue over next procedure
			}
			System.out.println("****Count is: "+cnt);
			cnt--;
		}
		
		for(int i=0;i<10;i++) {			
			if(i==5) {
				continue;									//skip followed operation and continue with next iteration
			}
			System.out.println("For count: "+i);
		}
	}

}
