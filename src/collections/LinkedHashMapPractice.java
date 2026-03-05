package collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPractice {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
		
		map.put(10, "ram");
		map.put(11, "sam");
		map.put(19, "sap");
		map.put(12,"joy");
		map.put(14, "ravi");
		map.put(11, "kalpi");
		
		System.out.println("size is "+map.size());

		
		System.out.println("LinkedHashMap "+map);
		
		System.out.println(map.get(11));//print the updated value since duplicate key
		
		for(Map.Entry<Integer,String> entry :map.entrySet()) {
			
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		
	}
}
