package basics;

public class Loops {

	public static void main(String[] args)
	{
		int n=4;
		int count=0;
		for (int i = 1; i <=5; i++) 
{
	if(n%i==0)
	{
		count++;
	}
}		
	if(count==2)
	{
		System.err.println(n+" is prime no");
	}
	else
	{
System.out.println(n+" is not a prime no");
	}

}
	}
