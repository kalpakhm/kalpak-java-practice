package basics;

public class StaticBlocks {

	static {
		System.out.println(" static block of class StaticBlocks ");
	}
	public static void main(String[] args) {
		//class.forname("B");
	    //class.forname("C");
	}
}

class B{
	static {
		System.out.println(" static block of class B ");
	}
}

class C{
	static {
		System.out.println(" static block of class C ");
	}
}