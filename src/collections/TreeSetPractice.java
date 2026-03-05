package collections;

import java.util.TreeSet;

public class TreeSetPractice {

	 public static void main(String[] args) {
		 
		 //TreeSet automatically sorts elements.

	        TreeSet<Integer> set = new TreeSet<>();

	        set.add(50);
	        set.add(10);
	        set.add(40);
	        set.add(30);
	        set.add(20);
	        set.add(30);

	        System.out.println("TreeSet: " + set);

	        // remove
	        set.remove(40);
	        System.out.println("After remove: " + set);

	        // first and last
	        System.out.println("First element: " + set.first());
	        System.out.println("Last element: " + set.last());

	        // iteration
	        for(Integer num : set)
	        {
	            System.out.println(num);
	        }
	    }
}
