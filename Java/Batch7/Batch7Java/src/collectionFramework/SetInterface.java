package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		//********************HashSet*****************************
//		Set st = new HashSet();
		HashSet hst = new HashSet();
		
		//add elements in HashSet (order of insertion - random)
		hst.add(1);
		hst.add("String");
		hst.add(33.23d);
		hst.add('A');
		hst.add(null);
		hst.add(1);     // duplicates are not allowed- only unique value will be considered
		
		System.out.println("Elements in HashSet are: " + hst);
		
		// to convert set into array
		Object[] arr = hst.toArray();
		int count = 0;
		for(Object x: arr) {
			System.out.println("Element in set is at " + count +" is: " + x);
			count++;
		}
		
		System.out.println("Element at 3 is: " + arr[3]);
		
		// to get element from set (cast to arrayList)
		ArrayList stt = new ArrayList(hst);
		Object val = stt.get(3);
		System.out.println("Element at 3 is: " + val);
		
		//to remove element from hashset
		hst.remove(null);
		System.out.println("elements in set after removal of object:  "+ hst);
		
		// to calculate size of hashset
		int len = hst.size();
		System.out.println("Size of set is: "+ len);
		
		// to iterate hashset
		 Iterator itr = hst.iterator();
		 while(itr.hasNext()) {			 
			 System.out.println("Element in set is " + itr.next());
		 }
		 
		//********************LinkedHashSet*****************************
//			Set lhst = new LinkedHashSet();
			LinkedHashSet lhst = new LinkedHashSet();
			
			//add elements in LinkedHashSet (order of insertion - maintained)
			lhst.add(1);
			lhst.add("String");
			lhst.add(33.23d);
			lhst.add('A');
			lhst.add(null);
			lhst.add(1);     // duplicates are not allowed- only unique value will be considered
			
			System.out.println("Elements in LinkedHashSet are: " + lhst);

			// to convert LinkedHashSet into array
			Object[] arr1 = lhst.toArray();
			int count1 = 0;
			for(Object x: arr1) {
				System.out.println("Element in set is at " + count1 +" is: " + x);
				count1++;
			}
			
			System.out.println("Element at 3 is: " + arr1[3]);
			
			// to get element from LinkedHashSet (cast to arrayList)
			ArrayList stth = new ArrayList(lhst);
			Object val1 = stth.get(3);
			System.out.println("Element at 3 is: " + val1);
			
			//to remove element from LinkedHashSet
			lhst.remove(null);
			System.out.println("elements in LinkedHashSet after removal of object:  "+ lhst);
			
			// to calculate size of LinkedHashSet
			int len1 = lhst.size();
			System.out.println("Size of LinkedHashSet is: "+ len1);
			
			// to iterate LinkedHashSet
			 Iterator itr1 = lhst.iterator();
			 while(itr1.hasNext()) {			 
				 System.out.println("Element in LinkedHashSet is " + itr1.next());
			 }
		
	//**********************TreeSet**********************************************
			 TreeSet<Integer> tst = new TreeSet<>();   // does doesn't support non-homogeneous
			 								// by default internally sorted
			 								
			 tst.add(1);
			 tst.add(7);
			 tst.add(3);
			 tst.add(10);
			 tst.add(5);
			 tst.add(5);					//duplicates not allowed
//			 tst.add(null);					// null not allowed
			 
			 System.out.println("Elements in TreeSet: "+ tst);
			 
		// to convert TreeSet into array
			Object[] arr2 = tst.toArray();
			int count2 = 0;
			for(Object x: arr2) {
				System.out.println("Element in TreeSet is at " + count2 +" is: " + x);
				count2++;
			}
			
			System.out.println("Element at 3 is: " + arr2[3]);
			
			// to get element from TreeSet (cast to arrayList)
			ArrayList tstt = new ArrayList(tst);
			Object val2 = tstt.get(3);
			System.out.println("Element at 3 is: " + val2);
			
			//to remove element from TreeSet
			tst.remove(5);
			System.out.println("elements in TreeSet after removal of object:  "+ tst);
			
			// to calculate size of TreeSet
			int len2 = tst.size();
			System.out.println("Size of TreeSet is: "+ len2);
			
			// to iterate TreeSet
			 Iterator itr2 = tst.iterator();
			 while(itr2.hasNext()) {			 
				 System.out.println("Element in TreeSet is " + itr2.next());
			 }			
	}
}
