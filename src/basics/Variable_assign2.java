package basics;

public class Variable_assign2 {
	static String name="kalpak";//static variables
	static char gender='m';//static variables
	int sal=1000000;//instance variables
	String desgn="Test engineer";//instance variables
	public void method1() {
		System.out.println(Variable_assign2.name);//Accessing and printing static variables using class name
		System.out.println(Variable_assign2.gender);//Accessing and printing static variables using class name
		System.out.println(sal);//Accessing and printing instance variable directly
		System.out.println(desgn); // Accessing and printing instance variables directly
	}
	static void method2() {//instance method
		//instance area
		System.out.println(Variable_assign2.name);//Accessing and printing static variables using class name
		System.out.println(Variable_assign2.gender);//Accessing and printing static variables using class name
		Variable_assign2 obj=new Variable_assign2();//creating an object to access instance to static context
		System.out.println(obj.sal);//ref_variable.variable
		System.out.println(obj.desgn);
	}
	public static void main(String[] args) {
		Variable_assign2 obj=new Variable_assign2();//crearing an object to call instance method in the static context
		obj.method1();//ref_var.methodname
		Variable_assign2.method2();//static to static classname.methodname 
	}

}
