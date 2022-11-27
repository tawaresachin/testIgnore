package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		
		//***********************1. Array List****************************//
		List lst = new ArrayList();
//		ArrayList lst = new ArrayList();
		SampleClass obj = new SampleClass();
		
		// add elements in Arraylist (CREATE)
		lst.add(1);
		lst.add("Batch-7");
		lst.add(true);
		lst.add('A');
		lst.add("");
		lst.add(null);
		lst.add(20.22f);
		lst.add(1);			//duplicates are allowed
		lst.add(obj);
		
		System.out.println("Array List is: " + lst);
		
		// Retrieve elements from array list (RETRIEVE)
		Object ele3 = lst.get(3);
		System.out.println(ele3);

		// update element in array list (UPDATE)
		lst.set(7, 2);
		System.out.println("Updated Array List is: " + lst);
		lst.set(lst.indexOf(null), "..");
		System.out.println("Updated Array List is: " + lst);
		
		// delete element in array 
		lst.remove(4);			//remove by index
		System.out.println("Array List after deletion is: " + lst);
		lst.remove(obj);		//remove by object value
		System.out.println("Array List after deletion is: " + lst);
		
		//Iterator in arrayList		
		Iterator itr = lst.iterator();
//		Iterator itr = lst.listIterator();
		while(itr.hasNext()) {
			Object ele = itr.next();
			System.out.println("Element of arrayList is: " + ele);			
		}
		
		//How to clear all elements in arrayList		
		lst.clear();
		System.out.println("Array List after clear operation: " + lst);
		
		//***********************2. Vector****************************//
		List vect = new Vector();
//		Vector vect = new Vector();
		SampleClass obj1 = new SampleClass();
		
		// add elements in vector (CREATE)
		vect.add(1);
		vect.add("Batch-7");
		vect.add(true);
		vect.add('A');
		vect.add("");
		vect.add(null);
		vect.add(20.22f);
		vect.add(1);			//duplicates are allowed
		vect.add(obj1);
		
		System.out.println("Elements in Vector are: " + vect);
		
		// Retrieve elements from vector (RETRIEVE)
		Object ele4 = vect.get(3);
		System.out.println(ele4);

		// update element in vector (UPDATE)
		vect.set(7, 2);
		System.out.println("Updated vector is: " + vect);
		vect.set(vect.indexOf(null), "..");
		System.out.println("Updated vector is: " + vect);
		
		// delete element in vector 
		vect.remove(4);			//remove by index
		System.out.println("Vector after deletion is: " + vect);
		vect.remove(obj1);		//remove by object value
		System.out.println("Vector after deletion is: " + vect);
		
		//Iterator in vector		
		ListIterator itr1 = vect.listIterator();
//		Iterator itr1 = vect.listIterator();
		while(itr1.hasNext()) {
			Object ele1 = itr1.next();
			System.out.println("Element of arrayList is: " + ele1);			
		}
		
		//How to clear all elements in arrayList		
		vect.clear();
		System.out.println("Vector after clear operation: " + vect);	
		
		//*************************Linked-List******************************
		List llst = new LinkedList();
		// add elements in vector (CREATE)
		llst.add(1);
		llst.add("Batch-7");
		llst.add(true);
		llst.add('A');
		llst.add("");
		llst.add(null);
		llst.add(20.22f);
		llst.add(1);			//duplicates are allowed
		llst.add(obj1);
		
		System.out.println("Elements in Linked-List: " + llst);
	// Retrieve elements from linked-List (RETRIEVE)
		Object ele5 = llst.get(3);
		System.out.println(ele5);

		// update element in linked-List (UPDATE)
		llst.set(7, 2);
		System.out.println("Updated linked-List is: " + llst);
		llst.set(llst.indexOf(null), "..");
		System.out.println("Updated linked-List is: " + llst);
		
		// delete element in linked-List 
		llst.remove(4);			//remove by index
		System.out.println("linked-List after deletion is: " + llst);
		llst.remove(obj1);		//remove by object value
		System.out.println("linked-List after deletion is: " + llst);
		
		//Iterator in vector		
		ListIterator itr2 = llst.listIterator();
//				Iterator itr2 = llst.listIterator();
		while(itr2.hasNext()) {
			Object ele1 = itr2.next();
			System.out.println("Element of linked-List is: " + ele1);			
		}
		
		//How to clear all elements in arrayList		
		llst.clear();
		System.out.println("linked-List after clear operation: " + llst);	
		
		//*********************Stack (LIFO)**************************
		Stack stk = new Stack();
						
		//push element on stack
		stk.push(1);
		stk.push("testing");
		stk.push(22.22f);
		stk.push(null);
		stk.push(true);
		
		// pop element from stack (retrieve top & delete)
		System.out.println("Stack before first pop: "+ stk);
		Object value = stk.pop();
		System.out.println("Popped value from stack is: "+ value);
		System.out.println("Stack after first pop: "+ stk);
		
		// find peek(top) element from stack (retrieve top but don't delete)
		Object value1 = stk.peek();
		System.out.println("Top element in stack: "+value1);
		System.out.println("Stack after first peek: "+ stk);
		
		int cap = stk.capacity();
		System.out.println("Capacity of stack: "+cap);
		
		
				
	}

}
