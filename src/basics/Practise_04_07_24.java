package basics;

public class Practise_04_07_24 {

	int a=2;
	static double b=10.2;
	public double method1() {
		System.out.println(a);//non static variable to non static method direct
		double m=Practise_04_07_24.b;
		double z=(a*m);
		return z;
	}
	public static void main(String[] args) {
		
		Practise_04_07_24 ref1=new Practise_04_07_24();
		System.out.println(ref1.method1());//can be print directly since returning the z
		//double x=ref1.method1();
		//System.out.println(x);
	}

}
