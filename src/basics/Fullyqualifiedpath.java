package basics;

public class Fullyqualifiedpath {

	int a=3;
	void demo() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Fullyqualifiedpath obj=new Fullyqualifiedpath();
		obj.demo();
		System.out.println(obj);//packagename.classname@hexadecimal no
		Fullyqualifiedpath b=obj;
		System.out.println(b);
	}

}
