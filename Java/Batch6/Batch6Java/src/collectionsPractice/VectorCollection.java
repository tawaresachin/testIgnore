package collectionsPractice;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import typesOfMethod.TestClass;

public class VectorCollection {

	public static void main(String[] args) {
		List vect = new Vector();
//		Vector vect = new Vector();
		TestClass test = new TestClass();
				//-----------adding objects in Vector----------
		vect.add("Batch#6");
		vect.add(26);
		vect.add(50.46);
		vect.add(true);
		vect.add(null);
		vect.add(test);
		vect.add(26);
		System.out.println(vect);		
		//-----------Remove by index in Vector----------
		vect.remove(3);
		System.out.println(vect);
		
		//-----------Remove by object in Vector----------
		vect.remove(test);
		System.out.println(vect);
		//-----------set an object in vector----------		
		vect.set(1, 'A');
		System.out.println(vect);
		//-----------Size of Vector----------
		int size = vect.size();
		System.out.println(size);
		//-----------Iterating Vector using for loop----------
		for(int i=0;i<size;i++) {
			System.out.println(vect.get(i));		
			}
		//-----------Iterating Vector by Iterator ----------
		ListIterator itr = vect.listIterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}		
		//-----------get an object from Vector----------	
		Object obj = vect.get(3);
		System.out.println(obj);
		//-----------Clearing objects in Vector----------
		vect.clear();
		System.out.println(vect);
	}
}
