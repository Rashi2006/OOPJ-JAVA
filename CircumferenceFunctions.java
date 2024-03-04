import java.util.Scanner;
public class CircumferenceFunctions{
    public static double circle(double r){
      double c=2*r;
       return c;
    }
	public static void main(String [] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the radius of the Circle:");
	  double r=sc.nextDouble();
	  double c=circle(r);
	  System.out.println("The circumference of the Circle is "+c);
	}
}