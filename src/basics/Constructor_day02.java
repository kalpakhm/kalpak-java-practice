package basics;

public class Constructor_day02 {
	int stud_id;
	String stu_name;
	int stu_age;
	Constructor_day02(int x,String y,int z){
		 stud_id=x;
		 stu_name=y;
		 stu_age=z;
	}
	
	public static void main(String[] args) {
		Constructor_day02 obj =new Constructor_day02(24,"kiran",18);
		System.out.println("student id is : "+obj.stud_id);
		System.out.println("student name is :"+obj.stu_name);
		System.out.println("student age is :"+obj.stu_age);
	}

}
