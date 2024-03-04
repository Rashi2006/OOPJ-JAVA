import java.util.*;
public class Switchgreet{
	public static void main(String[]args){
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n){
			case 1: System.out.println("Hello");
			          break;
			case 2: System.out.println("Namaste");
			          break;
			case 3: System.out.println("Bonjour");
			          break;
			default:  System.out.println("Invalid input");
		}
	}
}