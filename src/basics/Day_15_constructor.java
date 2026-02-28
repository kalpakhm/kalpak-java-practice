package basics;

public class Day_15_constructor {

	int stu_id,stu_age,stu_dob;
	String stu_name;
	//int stu_age;
	//int stu_dob;
	
	public Day_15_constructor(int id,String name,int age,int year) {
		this.stu_id=id;
		this.stu_name=name;
		this.stu_age=age;
		this.stu_dob=year;
	}
	public static void main(String[] args) {
		Day_15_constructor obj=new Day_15_constructor(01,"kalpak",29,1995);
		Day_15_constructor obj2=new Day_15_constructor(02,"keerti suresh",32,1992);
		obj.method();
		obj2.method();
	}
	public void method() {
		System.out.println("the name of the student is "+stu_name+",id "+stu_id+",his age and dob is "+stu_age+" ,"+ stu_dob);
	}
}


