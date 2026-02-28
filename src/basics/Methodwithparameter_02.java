package basics;

	
public class Methodwithparameter_02 {

	int a=2;
	int c=4;
	public static void main(String[] args) {
	Methodwithparameter_02.add(100,50);//just returned not utlized i.e printed
	Methodwithparameter_02.sub();
		Methodwithparameter_02.div(9,3.3f);
		System.out.println(Methodwithparameter_02.mult());
	}

	public static int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public static void sub() {
		int z=100;
		int c=12;
		System.out.println("subtrsction is "+(z-c));
	}
	public static void div(int a,float b) {
		float f=a/b;
		System.out.println("the div is : "+f);
		
	}
	public static int mult() {
		Methodwithparameter_02 obj=new Methodwithparameter_02();
		int a1=obj.a;
		int c1=obj.c;
		int z=a1*c1;
		return z;
		
	}
}


