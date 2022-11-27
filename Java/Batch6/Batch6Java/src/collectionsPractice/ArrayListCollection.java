package collectionsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import typesOfMethod.TestClass;

public class ArrayListCollection {

	public static void main(String[] args) {
		List lst = new ArrayList(); 
//		ArrayList lst = new ArrayList();		
		TestClass test = new TestClass();
		
		//-----------adding objects in Arraylist----------
		lst.add("Batch#6");
		lst.add(26);
		lst.add(50.46);
		lst.add(true);
		lst.add(null);
		lst.add(test);
		lst.add(26);
		System.out.println(lst);		
		//-----------Remove by index in Arraylist----------
		lst.remove(3);
		System.out.println(lst);		
		//-----------Remove by object in Arraylist----------
		lst.remove(test);
		System.out.println(lst);		
		//-----------set an object in Arraylist----------		
		lst.set(1, 'A');
		System.out.println(lst);		
		//-----------Size of Arraylist----------
		int size = lst.size();
		System.out.println(size);		
		//-----------Iterating Arraylist using for loop----------
		for(int i=0;i<size;i++) {
			System.out.println(lst.get(i));		}
		
		//-----------Iterating Arraylist by Iterator ----------
		ListIterator itr = lst.listIterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}	
		//-----------get an object from Arraylist----------	
		Object obj = lst.get(3);
		System.out.println(obj);		
		//-----------Clearing objects in Arraylist----------
		lst.clear();
		System.out.println(lst);
	}
}
