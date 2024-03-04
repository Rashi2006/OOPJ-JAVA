import java.util.Scanner;
public class L1circle{
	public static void main(String[]args){
		System.out.print("Enter Radius:");
		Scanner sc=new Scanner(System.in);
		Double r=sc.nextDouble();
		System.out.println("Area of Circle="+(3.14*r*r));
	}
}