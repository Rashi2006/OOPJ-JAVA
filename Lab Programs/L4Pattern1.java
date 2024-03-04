import java.util.Scanner;
public class L4Pattern1{
	public static void main(String [] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number:");
	   int r=sc.nextInt();
	   for(int i=1;i<=r;i++){
	   	 for(int j=1;j<=i;j++){
	   	 	System.out.print("*");
	   	 }
	   	 System.out.print("\n");
	   }
	   for(int i=(r-1);i>=0;i--){
	   	for(int j=1;j<=i;j++){
	   		System.out.print("*");
	   	}
	   	System.out.print("\n");
	   }
	}
}