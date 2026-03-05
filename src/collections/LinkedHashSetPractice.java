package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
	//LinkedHashSet = HashSet + Insertion Order

	public static void main(String[] args) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(100);
        set.add(20);
        set.add(40);
        set.add(30);
        set.add(10);
       

        System.out.println("LinkedHashSet: " + set);

        // remove
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // contains
        System.out.println("Contains 30? " + set.contains(30));

        // size
        System.out.println("Size: " + set.size());

        // iteration
        for(Integer num : set)
        {
            System.out.println(num);
        }
    }
}
