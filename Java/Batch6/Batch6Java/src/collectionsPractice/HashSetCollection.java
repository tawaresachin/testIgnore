package collectionsPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import typesOfMethod.TestClass;

public class HashSetCollection {

	public static void main(String[] args) {
		Set set = new HashSet();
//		HashSet set = new HashSet();
		TestClass test = new TestClass();
		//-----------adding objects in HashSet----------
		set.add(1);
		set.add("Batch#6");
		set.add('A');
		set.add(test);
		set.add(null);
		set.add(true);
		set.add(1);					//duplicates are not allowed
		System.out.println(set);   //order of insertion is not mentained
		//-----------Remove by Object in HashSet----------
		set.remove(1);
		set.remove(test);		//remove by object & not by index
		System.out.println(set);
		//-----------Size of HashSet----------
		int size = set.size();
		System.out.println(size);
		
		//-----------Iterating HashSet by For loop ----------
		Object[] arr = set.toArray();
		int len = arr.length;
		for(int i=0; i<len; i++) {
		  System.out.println(arr[i]);
		}		
		//-----------Iterating HashSet by Iterator ----------
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
		  Object obj = itr.next();
		  System.out.println(obj);
		}		
		//-----------clear HashSet ----------
		  set.clear();
		  System.out.println(set);
	}
}
