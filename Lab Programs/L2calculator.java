import java.util.*;
public class L2calculator{
	public static void main(String[]args){
	   System.out.print("Enter two numbers:");
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   String c=sc.next();
	   if(c.equals("+")){
	   	System.out.println("Sum="+(a+b));
	   }else if(c.equals("-")){
	   	System.out.println("a-b="+(a-b));
	   }else if(c.equals("*")){
	   	System.out.println("a*b="+(a*b));
	   }else if(c.equals("/")){
	   	System.out.println("a/b="+(a/b));
	   }else{
	   	System.out.println("Incorrect input");
	   }
	}
}
//char ch=sc.next()CharAt(0)