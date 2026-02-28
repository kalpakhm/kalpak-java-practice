package basics;

public class practise_static_instance {
	int m=10;
	static int n=5;
	public void method1() {
		
		
	}
	
	public static void main(String[] args) {
		
		 practise_static_instance ref=new practise_static_instance();
		 ref.add();
		 sub();
		 ref.mult();//ref_var.methodname
		 practise_static_instance.div();//class.methodname
	}
	
	public static void method2() {
		
	}
	
	public void add() {
		int m=2;
		int n=5;
		System.out.println(m+n);
		
	}
	public static void sub() {
		int j=9;
		System.out.println(j-n);
	}
	public void mult() {
		System.out.println(m*n);
		
	}
	public static void div() {
		int q=9;
		double d=3.0;
		System.out.println(q/d);
	}

}
