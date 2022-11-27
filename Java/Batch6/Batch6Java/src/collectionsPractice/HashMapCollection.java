package collectionsPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCollection {
	public static void main(String[] args) {
		Map<Integer,Object> map = new HashMap<>();
//		Map<?,?> map = new HashMap<>();
		
		// create a map of objects
		map.put(1, 10);
		map.put(2, 'A');
		map.put(4, "Batch#6");
		map.put(3, null);	//null value is allowed
		map.put(0, true);
		map.put(null, 10.23);  //null key is allowed
		map.put(1, 20);   //duplicate key not allowed
		System.out.println(map);
		//retrieve object from map
		Object obj = map.get(4);
		System.out.println(obj);
		//remove object from map
		map.remove(null);
		System.out.println(map);
		//getting all values from map
		Collection<Object> values = map.values();
		System.out.println(values);
		//getting all keys form map
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		//Iterating map using keys
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		//check if particular key is present in map
		boolean isKeyPresent = map.containsKey(5);
		System.out.println(isKeyPresent);
		//convert map into set of objects
		Set<Entry<Integer, Object>> mapToSet = map.entrySet();
		System.out.println(mapToSet);
		
		//
		String s= "Hi Hello Hi Hello Hi";
		String[] ar = s.split(" ");
		HashMap<String, Integer> m = new HashMap<>();
		for(String x: ar ) {
			if(m.containsKey(x)) {
				m.put(x, m.get(x)+1);
			} else {
				m.put(x, 1);
			}
		}
		System.out.println(m);

	}
}
