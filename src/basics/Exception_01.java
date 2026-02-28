package basics;


public class Exception_01 {
	public static void main(String[] args) {
		String q="jgdjkj";
		System.out.println("the String q "+q);
		String w=null;
		try {
		System.out.println("the String w length is "+w.length());
		}
		catch (NullPointerException e) {
			System.out.println("hey i have handled the length exception");
		}
		System.out.println("this is the last printing statement");
	}

}
