import java.util.Scanner;
public class L4ReverseArr{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		//int a[]={1,2,3,4,5,6};
		System.out.println("Enter the size of an array:");
		int arr_size=sc.nextInt();
        System.out.println("Enter the elements of array to be reversed:");
		int arr[]=new int[arr_size];
          for(int i=0;i<arr_size;i++){
	         arr[i]=sc.nextInt();
        }
		//int n=a.length;
		int []rev=new int[arr_size];
		int j=0;
		
		for( int i=(arr_size-1);i>=0;i--){
			rev[j]=arr[i];
			j++;
		}
		
		for( j=0;j<rev.length;j++){
	 	  System.out.println(rev[j]);
	    }
	}
}

