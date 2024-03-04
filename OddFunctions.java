import java.util.Scanner;
public class OddFunctions{
    public static void odd(int n){
       int i;
       for(i=1;i<=n;i++){
         if(i%2!=0){
           System.out.println(i);
         }
       }
    }
	public static void main(String [] args){
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       int n=sc.nextInt();
       odd(n);
	}
}