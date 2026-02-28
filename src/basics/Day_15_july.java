package basics;

public class Day_15_july {
	int a;
	int b;
	
	public Day_15_july(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		int a=10;
		int b=2;
		System.out.println(a);
		System.out.println(b);
		Day_15_july obj=new Day_15_july(1,2);
		obj.add();
		obj.sub();

	}
	public void add() {
		System.out.println(a+b);
	}
	public void sub() {
		System.out.println(a-b);
	}
	
}

