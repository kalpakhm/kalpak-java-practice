package collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapPractise {
	//TreeMap stores key–value pairs like HashMap but automatically sorts the keys.

	public static void main(String[] args) {
		
		TreeMap<Integer,Object> map=new TreeMap<>();
		
		map.put(10, "ram");
		map.put(11, "sam");
		map.put(19, "sap");
		map.put(12,"joy");
		map.put(14, "ravi");
		map.put(11, "kalpi");
		
		
		
		System.out.println("TreeMap size "+map.size()+" "+map);
		
		// get value
        System.out.println("Value of key 10: " + map.get(10));

        // remove
        map.remove(12);

        System.out.println("After remove: " + map);

        // contains
        System.out.println("Contains key 14: " + map.containsKey(14));

        // size
        System.out.println("Size: " + map.size());

        // iteration
        for(Map.Entry<Integer, Object> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
		
		System.out.println("First key "+map.firstKey());
		System.out.println("lower than 11 : "+map.lowerKey(11));
		System.out.println("last key "+map.lastKey());
		System.out.println("higher key than 11 : "+map.higherKey(11));
	}
	
}
