import java.util.Scanner;
public class L4avg{
	public static void main(String [] args){
	   Scanner sc=new Scanner(System.in);
	   int a[]= new int[4],i,sum=0;
	   System.out.println("Enter the numbers to calculate Average:");
       for(i=0;i<4;i++){
       	System.out.print("a["+i+"]=");
       	a[i]=sc.nextInt();
       	sum=sum+a[i];
       } 
       double avg;
       avg=sum/4.0;
       System.out.println("Average="+avg);
	}
}

