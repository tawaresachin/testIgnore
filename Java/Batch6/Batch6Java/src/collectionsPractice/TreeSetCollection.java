package collectionsPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import typesOfMethod.TestClass;

public class TreeSetCollection {

	public static void main(String[] args) {
		Set tset = new TreeSet();
//		TreeSet tset = new TreeSet();
		TestClass test = new TestClass();
		//-----------adding objects in TreeSet----------
		tset.add(1);
		tset.add(1);					//duplicates are not allowed
//		tset.add(null);					//null is not allowed
		tset.add(2);
		tset.add(3);					//only homogeneous objects are allowed
		System.out.println(tset);   //order of insertion is mentained
		//-----------remove from TreeSet----------
		tset.remove(1);
		System.out.println(tset);	
		//-----------Insert an object in TreeSet----------
		tset.add(1);
		tset.add(4);
		System.out.println(tset);      //  insertion is sorted by value
		//-----------Iterating TreeSet----------
		Iterator itr = tset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//-----------clear HashSet ----------
		tset.clear();
		System.out.println(tset); 
	}
}
