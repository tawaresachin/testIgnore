package collectionsPractice;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import typesOfMethod.TestClass;

public class LinkedListCollection {

	public static void main(String[] args) {
		List llst = new LinkedList();
//		LinkedList llst = new LinkedList();
		TestClass test = new TestClass();		
		//-----------adding objects in LinkedList----------
		llst.add("Batch#6");
		llst.add(26);
		llst.add(50.46);
		llst.add(true);
		llst.add(null);
		llst.add(test);
		llst.add(26);
		System.out.println(llst);		
		//-----------Remove by index in LinkedList----------
		llst.remove(3);
		System.out.println(llst);		
		//-----------Remove by object in LinkedList----------
		llst.remove(test);
		System.out.println(llst);		
		//-----------set an object in LinkedList----------		
		llst.set(1, 'A');
		System.out.println(llst);
		//-----------Size of LinkedList----------
		int size = llst.size();
		System.out.println(size);
		//-----------Iterating LinkedList using for loop----------
		for(int i=0;i<size;i++) {
			System.out.println(llst.get(i));		
			}
		//-----------Iterating LinkedList by Iterator ----------
		ListIterator itr = llst.listIterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}		
		//-----------get an object from LinkedList----------	
		Object obj = llst.get(3);
		System.out.println(obj);		
		//-----------Insertion of objects in LinkedList----------
		llst.add(2,0);
		System.out.println(llst);		
		//-----------Clearing objects in LinkedList----------
		llst.clear();
		System.out.println(llst);
	}
}
