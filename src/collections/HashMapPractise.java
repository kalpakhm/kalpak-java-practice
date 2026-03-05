package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractise {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<>();
		map.put(10, "kalpak");
		map.put(11, "kalpi");
		map.put(12, "hello");
		map.put(13, "okay");
		map.put(9, "bye");
		map.put(14, "hello");//duplicate value 
		map.put(11, "kalp");//duplicate key 
		
		System.out.println("Hashmap "+"size "+map.size()+" "+map);
		
		System.out.println("value of 12 "+map.get(12));
		
		System.out.println("contains key "+map.containsKey(9));
		
		System.out.println("contains value "+map.containsValue("kalpak"));
		
		//remove
		map.remove(11);
		System.out.println("after removing key 11 "+map);
		
		// iterate keys
		for(Object key:map.keySet()) {
			System.out.println(key);
		}
		
		// iterate values
		for(String value:map.values()) {
			System.out.println(value);
		}
		
		// iterate key and value
		for(Integer key:map.keySet()) {
			System.out.println(key +" value is -> "+ map.get(key));
		}
		
		//using entryset()
		//If you need both the key and the value, entrySet() is faster than keySet() because it avoids an extra map.get(key) lookup for every item.
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
		
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	
	}
}
