import java.util.Scanner;
public class AvgFunctions{
	public static double avg(double a,double b,double c){
		double avg;
		avg=(a+b+c)/3;
		return avg;
	}
	public static void main(String [] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the three numbers:");
	   double a=sc.nextDouble();
	   double b=sc.nextDouble();
	   double c=sc.nextDouble();
       
       double avg=avg(a,b,c);
       System.out.println("The average of three numbers="+avg);
	}
}