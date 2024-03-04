import java.util.Scanner;
public class L3palindrome_1{
	public static void main(String [] args){
	 System.out.println("Enter the number:");
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int temp=n;
	 int i,r,p=0;
	   for(i=0;n!=0;i++){
        r=n%10;
        p=p*10+r;
        n=n/10;
	   }
        if(p==temp){
    	   System.out.println("Palindrome Number");
        }else{
    	   System.out.println("Not Palindrome Number");
        }
    }
}