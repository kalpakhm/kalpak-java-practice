package basics;

public class Variable_assign1 {
	//2 instance variables
	int sal=100000;
	String emp="kalpak";
	static void method1() {
		Variable_assign1 obj=new Variable_assign1();
		System.out.println(obj.sal);
		System.out.println(obj.emp);
		//method is completed object is destroyed
	}
	static void method2() {
		Variable_assign1 obj=new Variable_assign1();
		System.out.println(obj.sal);
		System.out.println(obj.emp);
		}
	public static void main(String[] args) {
		Variable_assign1.method1();//classname.methodname
		Variable_assign1.method2();
	}
	}

