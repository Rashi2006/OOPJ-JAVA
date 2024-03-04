import java.util.Scanner;
class Circle{
	double r;
	double area(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		double r=sc.nextDouble();
		double area=(3.14)*r*r;
		return area;
	}
}
public class CircleDemo{
	public static void main(String [] args){
		Circle c1 = new Circle();
		System.out.println("Radius of Circle1="+c1.area());
	}
}