import java.util.Scanner;
public class Fibo{
	public static void main(String [] args){
	   Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number of terms for fibo:");
         int n=sc.nextInt();
         int []r=new int[n+1];
         r[0]=r[1]=1;
         int i;
         for(i=2;i<=n;i++){
           r[i]=r[i-1]+r[i-2];
           System.out.println("r["+i+"]="+r[i]);
         }
         System.out.println(r[n]);
	}
}