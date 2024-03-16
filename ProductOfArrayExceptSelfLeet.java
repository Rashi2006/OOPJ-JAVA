import java.util.Scanner;
import java.util.ArrayList;
class ProductOfArrayExceptSelf{
	static void productOfArray(int [] nums){
       int []num=new int[nums.length];
       int i=0;
       
       int product=1;
       while(i<nums.length){
       	    int j=0;
            while(j<nums.length){
            	if(i!=j){
            		System.out.println("i="+i+"j="+j);
                  product*=nums[j];
            	}
            	j++;
            }
            System.out.println("product="+product);
            num[i]=product;
            product=1;
            i++;
       }
       for( i=0;i<nums.length;i++){
       	System.out.println(num[i]);
       }
	}
}
public class ProductOfArrayExceptSelfLeet{
	public static void main(String [] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("ENter the size of an array:");
	int n=sc.nextInt();

	int [] nums=new int[n];

	for(int i=0;i<n;i++){
        System.out.println("Enter nums["+i+"]=");
       	nums[i]=sc.nextInt();
    }
    ProductOfArrayExceptSelf.productOfArray(nums);
	}
}