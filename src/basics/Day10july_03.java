package basics;

public class Day10july_03 {

	static void triangle(int b,int h) {
		double a=0.5*b*h;
		System.out.println("area of triangle is : "+a);
		return;
		
	}
	public int square(int side) {
		int res=side*side;
		return res;
	}
	public Day10july_03(int a,int b,int h){
		double res=0.5*(a+b)*h;
		System.out.println("area of trapizoidal is : "+res);
	}
	public Day10july_03() { //default constructor{
		int b=3,h=5;
		int rect=b*h;
		System.out.println(rect);
		return;
	}
	public static void main(String[] args) {
		new Day10july_03(8,7,9);
		Day10july_03 obj2=new Day10july_03();
		System.out.println(obj2.square(5));
		Day10july_03.triangle(2, 8);
		
	}
}

