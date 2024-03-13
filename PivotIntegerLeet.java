import java.util.*;
class PivotInteger{
	static int pivot(int n){
        int x=1;
        int count=0;
        int flag=0;
        while(x<=n){
        	for(int i=1;i<=x;i++){
        		count+=i;
        	}
        	for(int i=x;i<=n;i++){
        		flag+=i;
        	}
        	if(count==flag){
        		return x;
        	}
        	else{
               x++;
               count=0;
               flag=0;
        	}
        }
        return -1;
	}
}
public class PivotIntegerLeet{
	public static void main(String [] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("ENter the number:");
    int n=sc.nextInt();
    System.out.println("x="+PivotInteger.pivot(n));
	}
}