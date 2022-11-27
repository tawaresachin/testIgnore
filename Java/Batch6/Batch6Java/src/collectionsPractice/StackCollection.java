package collectionsPractice;

import java.util.List;
import java.util.Stack;

import typesOfMethod.TestClass;

public class StackCollection {

	public static void main(String[] args) {
//		List stk = new Stack();
		Stack stk = new Stack();
		
		TestClass test = new TestClass();
		
		//-----------push objects in stack----------
		stk.push(10);
		stk.push(42.32);
		stk.push('A');
		stk.push(true);
		stk.push(null);
		stk.push("Batch#6");
		stk.push(test);
		
		System.out.println(stk);
		
		//-----------pop objects from stack (LIFO)----------
		stk.pop();
		System.out.println(stk);
		
		//-----------peek objects in stack----------
		Object obj = stk.peek();
		System.out.println(obj);
	}

}
