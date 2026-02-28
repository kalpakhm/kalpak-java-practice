package basics;

public class Practise2 {
	static int a=2;
	int b=4;
	public void method1() {
		int b=6;
		int c=9;
		System.out.println(b*a*c);
		System.out.println("hello"+" i have printed method1");
	}

	public static void main(String[] args) {
		 Practise2 ref=new Practise2();
		 System.out.println("entered the main method");
		 ref.method1();
		Practise2.method2(); //method2();
		System.out.println("main method closed");
	}
	
	public static void method2() {
		System.out.println("i am a staic");
		Practise2 ref=new Practise2();
		//ref.method1();
		ref.method3();  
	}
	void method3() {
		System.out.println("i am from method3");
	}
	
}
