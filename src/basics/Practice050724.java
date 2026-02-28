package basics;

public class Practice050724 {

	static double salary=50000;
	static int pg=10000;
	 int party=5000;
	static int emi=20000;
	 int others=5000;
	static int rent=1000;
	
	public static void savings() {
		double tot_earnings=Practice050724.salary+Practice050724.rent;
		System.out.println("my total earnings is : "+tot_earnings);
		Practice050724	obj1=new Practice050724();
		double savings=tot_earnings-obj1.expensive();//returned the value tot_exp
		System.out.println("my savings is : "+savings);
		
	}
	public int expensive() {
		
		int tot_exp=Practice050724.pg+party+Practice050724.emi+others;//Local variables cannot be declared with the static keyword.	}
		System.out.println("my total expenses is : "+tot_exp);
		return tot_exp;
	}
	public static void main(String[] args) {
		Practice050724.savings(); 
		Practice050724 obj2= new Practice050724();
		obj2.expensive();
		

	}

}
