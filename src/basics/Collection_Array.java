package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_Array {

	public static void main(String[] args) {
		//Declaration
		//ArrayList l= new ArrayList();
		//List l=new ArrayList(); yes because child class object can hold in parent class ref var
		/*ArrayList<Integer> l=new ArrayList<Integer>();//i want to store only homogenous type of data i.e integer
		cannot use primitive datatype like int, so use wrapper class */
		
		ArrayList l=new ArrayList();
		
		//adding data to arraylist
		l.add(120);
		l.add("kalpak");
		l.add(120);
		l.add('k');
		l.add(12.34);
		l.add("hello");
		l.add(true);
		l.add(null);
		
		//size of arraylist
		System.out.println("size of arraylist is "+l.size());
		
		//print the arraylist
		System.out.println(l);//[120, kalpak, 120, k, 12.34, hello, true, null]
		
		//remove element from the arraylist
		l.remove(0);
		System.out.println("after removing 0 index "+l);//[kalpak, 120, k, 12.34, hello, true, null]
		
		//insert element in arraylist
		l.add(1 , "hm");
		System.out.println("after inserting hm in 1st index "+l);//[kalpak, hm, 120, k, 12.34, hello, true, null]
		
		//modify/replace the element
		l.set(5, "bye");
		System.out.println("after replace hello "+l);//[kalpak, hm, 120, k, 12.34, bye, true, null]
		
		//access specific element
		System.out.println("get the 4th index "+l.get(4));//get the 4th index 12.34
		
		//Reading all the elements from arraylist
		
		/*using normal for loop
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}*/
		
		//using foreach loop
		for(Object x:l)
		{System.out.println(x);}//Object since having all the types like int,string,chat
		
		/*using iterator (only for collection)
		Iterator <Object> it=l.iterator();
		System.out.println("printing through iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		//checking arraylist empty or not
		System.out.println(l.isEmpty());
		
		//remove all the elements in arrayList
		ArrayList l2=new ArrayList();
		l2.add("hm");
		l2.add(null);
		l.removeAll(l2);
		System.out.println("after removing "+l);//after removing [kalpak, 120, k, 12.34, bye, true]
		
		//clear all arraylist
		l.clear();
		System.out.println("after removal of all ,is arraylist empty.? "+l.isEmpty());
	
	}
}   
