package basics;

public class Day10july_02 {

	public Day10july_02(){
		System.out.println("hello im a constructor");
	}
	public Day10july_02(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Day10july_02 obj = new Day10july_02();
		new Day10july_02(5);

	}

}
