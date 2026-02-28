package basics;

public class MethodWithParameter {

	
	public static void main(String[] args) {
		
		MethodWithParameter ref=new MethodWithParameter();
		System.out.println(ref.add());
		ref.subtraction(5,10);
		ref.mult();
		ref.div();
	}
	public int add() {
		int a=2,b=4;
		return a+b;
	}
	public void subtraction(int a,int b) {
		
		System.out.println(b-a);
	}
	public int mult() {
		int a=2,b=4,c=6;
		int z=a*b*c;
		return z;
	}
	public void div() {
		int a=10,b=2;
		System.out.println(a/b);
		
	}
}


