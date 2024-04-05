import java.util.*;
public class PowXNLeet{
	public static void main(String [] args){

	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    System.out.println("Enter the value of x:");
    double x = sc.nextDouble();
    double r=x;
    for(int i=2;i<=(double)Math.abs(n);i++){
        x*=r;
        
    } 
    System.out.println(x);
    if(n<0){
    	x=1/x;
    }
    
    System.out.println(x);
	}
}