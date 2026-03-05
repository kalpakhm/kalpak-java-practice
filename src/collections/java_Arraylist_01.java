package collections;

import java.util.ArrayList;
import java.util.Collections;

public class java_Arraylist_01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(39);
		System.out.println("l1--->"+l1);
		System.out.println("Element at index 2: "+l1.get(2));
		l1.add(1,15);
		System.out.println("After inserting 15 at index 1:"+l1);
		System.out.println("Contains 15? "+l1.contains(15));
		Collections.reverse(l1);
		System.out.println("After reversing the collection"+l1);
		Collections.sort(l1);
		System.out.println("After sorting the collection"+l1);
		
		
		
		ArrayList<Object> l2=new ArrayList();
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.add(50);
		l2.add(10);
		
		System.out.println("l2-->"+l2);
		System.out.println("removing through index 0"+l2.remove(0)+l2);
		System.out.println("removing through Object 50"+l2.remove(Integer.valueOf(50))+l2);//avoid indexoutofboundsexceptions
		
		
		System.out.println("addAll result:"+l2.addAll(l1));
		System.out.println(l2);
		
	}

}
