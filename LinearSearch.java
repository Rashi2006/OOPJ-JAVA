import java.util.Scanner;
public class LinearSearch{
	public static void main(String [] args){
	  int a[]={1,5,6,9,78,8,45,12,14,56,23};
	  System.out.println("Enter the number to be searched:");
	  Scanner sc=new Scanner(System.in);
	  int r=sc.nextInt();
	  int i=0;
	  boolean found = false;
	  for(i=0;i<a.length;i++){
	  	if(a[i]==r){
	  		System.out.println("The number is found at"+ (i+1));
	  		found=true;
	  		break;
	  	}
	  }
	  if(found==false){
	  	System.out.println("The number does not exist");
	  }
	}
}