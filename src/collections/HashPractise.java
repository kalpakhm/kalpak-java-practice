package collections;

import java.util.HashSet;

public class HashPractise {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<>();
		set.add("kalpak");
		set.add("hello");
		set.add("kalpi");
		set.add("hello");//duplicate
		set.add("girl");
		set.add("sap");
		
		System.out.println("HashSet "+set);
		
		//comtains
		System.out.println("Contains kalpi? "+set.contains("kalpi"));
		
		//size
		System.out.println("size "+set.size());
		
		//remove
		set.remove("sap");
		System.out.println("After remove size & sap "+set.size()+""+set);
		
		System.out.println("Is empty? " +set.isEmpty());
		
		//iterate
		for(String s:set) {
			System.out.println(s);
		}
		
		//clear
		set.clear();
		System.out.println("after clear"+set);
	}
}
