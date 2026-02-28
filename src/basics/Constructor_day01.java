package basics;

public class Constructor_day01 {

	String emp_name;
	String emp_id;
	String emp_company;
	int emp_sal;
	double emp_exp;
	Constructor_day01(String name,String id,String comp,int sal,double exp){
		 emp_name=name;
		 emp_id=id;
		 emp_company=comp;
		 emp_sal=sal;
		 emp_exp=exp;
		}
	public static void main(String[] args) {
		Constructor_day01 obj1=new Constructor_day01("Kalpak H M","TYC0524007","Test Yantra",100000,4.8);
		System.out.println(obj1);
		System.out.println(obj1.emp_name);
		System.out.println(obj1.emp_id);
		System.out.println(obj1.emp_company);
		System.out.println(obj1.emp_sal);
		System.out.println(obj1.emp_exp);
		
	}

}
