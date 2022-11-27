package collectionsPractice;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import typesOfMethod.TestClass;

public class LinkedHashSetCollection {

	public static void main(String[] args) {
		Set lset = new LinkedHashSet();
//		LinkedHashSet lset = new LinkedHashSet();
		TestClass test = new TestClass();
		//-----------adding objects in LinkedHashSet----------
		lset.add(1);
		lset.add("Batch#6");
		lset.add('A');
		lset.add(test);
		lset.add(null);
		lset.add(true);
		lset.add(1);					//duplicates are not allowed
		System.out.println(lset);   //order of insertion is mentained
		//-----------Remove by object in LinkedHashSet----------
		lset.remove(test);
		System.out.println(lset);
		//-----------Insert an object in LinkedHashSet----------
		lset.add(2);
		System.out.println(lset);
		//----------Size of LinkedHashSet----------
		int size = lset.size();
		System.out.println(size);
		//----------Iterating LinkedHashSet using for loop----------
		Object[] arr = lset.toArray();
		int len = arr.length;
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]);
		}
		//----------Iterating LinkedHashSet using iterator----------
		Iterator itr=lset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());		}
		
		//-----------clear HashSet ----------
		  lset.clear();
		  System.out.println(lset);

	}

}
