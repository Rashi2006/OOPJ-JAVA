import java.util.Scanner;
public class GreaterOfTwoFunctions{
    public static int greatest(int a , int b){
      if(a>b){
         return a;
      }else{
         return b;
      }
    }
	public static void main(String [] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter two numbers:");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int r=greatest(a,b);
	  System.out.println("The largest of two number is "+ r);
	}
}