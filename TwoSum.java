import java.util.Scanner;
public class TwoSum{
	public static void main(String [] args){
	  Scanner sc= new Scanner(System.in);
      
       int n[]={2,3,4,5};
       int target=9;
	   for(int i=0;i<4;i++){
	   	 for(int j=(i+1);j<=3;j++){
	   	 	if(n[i]+n[j]==target){
	   	 		System.out.println((i)+" "+(j));
	   	 	}
	   	 }
	   }
	}
}