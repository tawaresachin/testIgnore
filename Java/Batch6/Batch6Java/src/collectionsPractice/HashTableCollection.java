package collectionsPractice;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableCollection {

	public static void main(String[] args) {
		Map<String,String> htable = new Hashtable<>();
		// Create a hash table
		htable.put("Summer", "Mango");
		htable.put("Winter", "Orange");
		htable.put("Rainy", "Banana");
//		htable.put("Springe", null);   //null value is not allowed
//		htable.put(null, "random");	   //null key is not allowed
		System.out.println(htable);
		//retrieve desired value from htable
		String obj = htable.get("Rainy");
		System.out.println(obj);
		// extract all keys in htable
		Set<String> keys= htable.keySet();
		System.out.println(keys);
		// Iterating in htable
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.println(htable.get(itr.next()));
		}
		//get the size of htable
		int size = htable.size();
		System.out.println(size);
		//check if key is present
		boolean isKeyPresent = htable.containsKey("xxx");
		System.out.println(isKeyPresent);
		//convert htable to set
		 Set<Entry<String, String>> htableToSet = htable.entrySet();
		 System.out.println(htableToSet);		

	}

}
