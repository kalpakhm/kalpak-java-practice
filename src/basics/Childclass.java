package basics;

public class Childclass extends Superclass {
	int a=10;
    int b=20;
    void child(int a,int b)
     {      
         System.out.println(a+b);//printed local i.e 300
        System.out.println(this.a+this.b);//prints class level i.e 30
        System.out.println(super.a+super.b);// prints super class i.e 3
    }
    public static void main(String[] args) {
		new Childclass().child(100,200);
	}
}
