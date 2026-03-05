package collections;

import java.util.LinkedList;

public class LinkedListFullPractise {

	public static void main(String[] args) {
		
		LinkedList<Integer>list=new LinkedList<>();
		
		// ===== 1. ADD ELEMENTS =====
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("Initial List: "+list);
		
		// ===== 2. ADD FIRST & LAST =====
		list.addFirst(5);
		list.addLast(55);
		System.out.println("after adding First & Last"+list);
		
		list.add(4, 35);
		System.out.println("After add at index 4"+list);
		
		// ===== . GET METHODS =====
		System.out.println("Element at index 5"+list.get(5));
		System.out.println("First element "+list.getFirst());
		System.out.println("Last element "+list.getLast());
		
		list.removeFirst();
		list.removeLast();
		System.out.println("After removeFirst & removeLast:"+list);
		
		 // ===== 9. STACK BEHAVIOR (LIFO) =====
        list.push(200);
        list.push(300);
        System.out.println("After push (Stack): " + list);

        System.out.println("Pop element: " + list.pop());
        System.out.println("After pop: " + list);
		
        // ===== 10. QUEUE BEHAVIOR (FIFO) =====
        list.offer(400);
        list.offer(500);
        System.out.println("After offer (Queue): " + list);

        System.out.println("Peek element: " + list.peek());
        System.out.println("Poll element: " + list.poll());
        System.out.println("After poll: " + list);
	}
}
