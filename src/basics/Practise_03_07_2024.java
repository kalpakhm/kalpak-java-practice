package basics;

public class Practise_03_07_2024 {
	
	static int x=10;
	int y=5;
	public void method1() {
		int a=2;
		int b=4;
		System.out.println(a+b);
		System.out.println(x/y);
		System.out.println(Practise_03_07_2024.x);//static to instance classname.
		System.out.println(y);//instance to instance direct
		System.out.println("ended method1");
	}
	public static void method2() {
		int m=2;
		System.out.println("entered method2");
		System.out.println(Practise_03_07_2024.x/m);
		Practise_03_07_2024 obj=new Practise_03_07_2024();
		System.out.println(obj.y);
		
	}
  
	public static void main(String[] args) {
		
		System.out.println("entered the main method");
		Practise_03_07_2024 obj1=new Practise_03_07_2024();
		obj1.method1();
		Practise_03_07_2024.method2();
	}

}
