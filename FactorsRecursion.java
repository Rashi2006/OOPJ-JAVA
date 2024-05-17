import java.util.Scanner;
class Factors{
	int ans(int i,int n){
		if(n%i==0){
			return i;
		}else{

		}
	}
}
public class FactorsRecursion{
	public static void main(String [] args){
	     System.out.println("Enter the number:");
	     int n=sc.nextInt();
	     int i=1;
	     Factors f = new Factors();
	     int ans=f.ans(i,n);
         if(i<=n){
           
           if(ans!=0){
           	System.out.println(ans);
           }
            ans=f.ans(i,n);
         }
    }
}
