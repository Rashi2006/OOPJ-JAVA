import java.util.Scanner;
public class L3prime{
	public static void main(String [] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n=sc.nextInt();
	  int i,r;
	  int count=0;
	  if(n<=2){
	  	System.out.println("Not Prime");
	  	count++;
	  }else{
	    for(i=2;i<=Math.sqrt(n);i++){
           if(n%i==0){
           	
           	  System.out.println("Not Prime");
           	  count++;
           	  break;
           }
	    }

	  }
	  if(count==0){
	  	 System.out.println("Prime");
	  }
	}
}