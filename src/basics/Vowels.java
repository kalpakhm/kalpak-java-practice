package basics;

public class Vowels {

	 public static  void main(String[] args) {
         String s="kalp12ak!@3";
      int count=0;
     String s2= s.toLowerCase();
      char[] ch=s2.toCharArray();
      for(int i=0;i<ch.length;i++){
         // if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
         if("aeiou".indexOf(ch[i])!=-1)
          {
               System.out.println(ch[i]+" is vowel");
               count++;
          }
          else{
              System.out.println(ch[i]+" is not vowel");
          }
      }
           System.out.println(count+" is the total no of vowels present");

   }
	
}
