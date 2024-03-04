import java.util.Scanner;
public class L3division{
	public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Please Enter the total marks:");
      double total=sc.nextDouble();
      System.out.println("Please Enter the marks of 5 subjects:");
      
      double s1=sc.nextDouble();
      while(s1>total){
         System.out.println("Please enter valid marks");
         s1=sc.nextDouble();
      }
      double s2=sc.nextDouble();
      while(s2>total){
         System.out.println("Please Enter valid marks");
         s2=sc.nextDouble();
      }
      double s3=sc.nextDouble();
      while(s3>total){
         System.out.println("Please Enter valid marks");
         s3=sc.nextDouble();
      }
      double s4=sc.nextDouble();
      while(s4>total){
         System.out.println("Please Enter valid marks");
         s4=sc.nextDouble();
      }
      double s5=sc.nextDouble();
      while(s5>total){
         System.out.println("Please Enter valid marks");
         s5=sc.nextDouble();
      }
      double per;
      per=(s1+s2+s3+s4+s5)*100/5*total;
      if(per>=60){
      	System.out.println("First Division");
      }else if(per>=50){
      	System.out.println("Second Division");
      }else if(per>=40){
      	System.out.println("Third Division");
      }else{
        System.out.println("Fail");
      }
	}
}