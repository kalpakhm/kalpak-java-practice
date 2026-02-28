package basics;

public class Day10july {

	public double circle(int r) {
		final double pi=3.14;
		double res=pi*r*r;
		return res;
	}
	public static int rect(int a,int b) {
		int res=a*b;
		return res;
	}
	
	public static void main(String[] args) {
		Day10july  z=new Day10july();//object.method name
		System.out.println(z.circle(5));
		System.out.println(Day10july.rect(5, 6));//static to static classname.method_name
	}

}

 