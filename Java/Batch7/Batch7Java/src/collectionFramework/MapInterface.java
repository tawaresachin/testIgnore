package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		//*****************HashMap********************
		Map map1 = new HashMap();		
		//to add elements in map1
		map1.put(1, "Test");
		map1.put("Second", 1);		
		System.out.println("Elements in HashMap map1 are: "+ map1);
		
		//to add elements in map2
		Map<Integer, String> map2 = new HashMap();
		
		map2.put(1, "Test");
		map2.put(2, "Test1");
		map2.put(null, "Test2");		// null key is allowed
//		map2.put("obj", "Test3");     // Key type or Value type mismatch not allowed
		map2.put(3, "Test3");
		map2.put(3, null);        // duplicate key not allowed & if tried it overrides value against it 
		map2.put(4, "Test2");   	// duplicate values are possible
		map2.put(5, null);   	   // duplicate null  values are possible
		System.out.println("Elements in HashMap map2 are: "+ map2);   // sorted order of insertion as per value of key
		
		// to get the value from map1
		 Object obj1 = map1.get(1);
		 System.out.println("Element value against key- 1 is: "+ obj1);
		 Object obj2 = map1.get("Second");
		 System.out.println("Element value against key- String is: "+ obj2);
		 
		// to get the value from map2
		 Object obj3 = map2.get(null);
		 System.out.println("Element value against key- null is: "+ obj3);
		 Object obj4 = map2.get(3);
		 System.out.println("Element value against key- 3 is: "+ obj4);
		 
		 // to extract all values of full map
		 Collection<String> vals = map2.values();
		 Iterator<String> valItr = vals.iterator();
		 while(valItr.hasNext()) {
			 System.out.println("Value in map2 is: " + valItr.next());
		 }
		 
		 // to extract all keys of full map
		  Set<Integer> keys = map2.keySet();
		  Iterator<Integer> keyItr = keys.iterator();
		  while(keyItr.hasNext()) {
			  System.out.println("Key in map2 is: " + keyItr.next());
		  }
		  
		  // to remove object from map
		  map2.remove(5);
		  System.out.println("Elements in map2 after removal of object against key-5: " + map2);
		  
		  //to convert map into set
		  Set<Entry<Integer, String>> mapToSet = map2.entrySet();
		  System.out.println("map2 converted to set: " + mapToSet);
		  
		  //to calculate size of map
		  System.out.println("Size of map2 is: " + map2.size());
		  
		  //to validate if certain key is present in map
		  boolean flag = map2.containsKey(null);
		  System.out.println("Check if key-null is present in map2?: " + flag);
		  
		  // Interview Question
		  String str = "Hi Hello Hi Hello Hi";
		  String[] ar = str.split(" ");
		  Map<String, Integer> map3 = new HashMap();
		  for(String x : ar) {
			  if(map3.containsKey(x)) {
				  map3.put(x, map3.get(x)+1);
			  } else {
				  map3.put(x, 1);
			  }
		  }		  
		  System.out.println("Map3 output is: "+ map3);
		  
		  //Interview Question
		  String strr = "india";
		  char[] arr = strr.toCharArray();
		  Map<Character, Integer> map4 = new HashMap();
		  for(Character x : arr) {
			  if(map4.containsKey(x)) {
				  map4.put(x, map4.get(x)+1);
			  } else {
				  map4.put(x, 1);
			  }
		  }		  
		  System.out.println("Map4 output is: "+ map4);		
		  
		  
		  //*************************HashTable*********************
		  Map<Integer, String> htb = new Hashtable();
		  
		  htb.put(1, "one");
		  htb.put(2, "two");
		  htb.put(3, "three");
		  htb.put(3, "four");		// duplicate key overrides previous value
//		  htb.put(null, "one");		// null key not allowed
//		  htb.put(4, null);			// null value not allowed
		  
		  System.out.println("Elements in hashtable are: " + htb);
		  
		  //to get value from hash table
		  System.out.println("element in hashtable at key-1 is: " + htb.get(1));
		  
		  //to remove value from hash table
		  htb.remove(3);
		  System.out.println("elements in hashtable after removal of object: " + htb);
		  
		  //to get all keys from hashtable
		  Set<Integer> keyHtb = htb.keySet();
		  Iterator<Integer> itrHtbKeys = keyHtb.iterator();
		  while(itrHtbKeys.hasNext()) {
			  System.out.println("Key in HashTable: " + itrHtbKeys.next());
		  }
		  
		  // to get all values from hashtable
		  Collection<String> htbValues = htb.values();
		  Iterator<String> itrHtbValue = htbValues.iterator();
		  while(itrHtbValue.hasNext()) {
			  System.out.println("Value in HashTable: " +  itrHtbValue.next());
		  }		  
	}
}
