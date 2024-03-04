import java.util.Scanner;
public class BinarySearch{
	public static void main(String [] args){
	  Scanner sc=new Scanner(System.in);
	    int a[]={1,2,47,89,90,96,97,99,105,108,112,133,145,150};
	    System.out.println("Enter the number to be searched:");
	    int r=sc.nextInt();
	    int low=0,high=a.length-1,mid;
	    boolean nf=false;
	    while(high>=low){
	    	mid=(high+low)/2;
              if(r<a[mid]){
              	high=mid-1;
              }else if(r==a[mid]){
              	System.out.println("The number is found at="+(mid+1));
                nf=true;
                break;
              }else if(r>a[mid]){
              	low=mid+1;
              }
	    }
	    if(nf==false){
            System.out.println("Number does not exist");
	    }
	}
}