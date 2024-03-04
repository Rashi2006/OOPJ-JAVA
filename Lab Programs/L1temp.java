import java.util.Scanner;
public class L1temp{
	public static void main(String[]args){
		System.out.print("Enter temperature in F :");
		Scanner sc=new Scanner(System.in);
		Double F=sc.nextDouble();
		System.out.println("c="+((F-32)*5/9));
	}
}