package java_programs;

public class Digit_sum_count {

	public static void main(String[] args) {
		
	     int no=246;
	        int sum=0;
	        int count=0;
	        while(no>0){
	            int digit=no%10;
	         //   if(digit%2!=0) for odd,
	            count++;
	            sum=sum+digit;
	            no=no/10;
	        }
	        System.out.println("The sum of the given number is "+sum);
	        System.out.println("the no of digits present is "+count);
	    
	}
}
