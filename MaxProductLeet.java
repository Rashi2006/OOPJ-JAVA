import java.util.Scanner;
 class Product{
 	static int maxProduct(int [] nums){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
        	if(max1<nums[i]){
        		max3=max2;
        		max2=max1;
        		max1=nums[i];
            }else if(max2<nums[i]){
            	max3=max2;
            	max2=nums[i];
            }else if(max3<nums[i]){
            	max3=nums[i];
            }

            if(min1>nums[i]){
            	min2=min1;
            	min1=nums[i];
            }else if(min2>nums[i]){
            	min2=nums[i];
            }


        }
        return Math.max(max1*max2*max3 , min1*min2*max1);
 	}
	
}
public class MaxProductLeet{
	public static void main(String [] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter size of an array:");
	   int n=sc.nextInt();
	   int []nums = new int[n];
	   System.out.println("Enter the array of numbers to find the maximum product:");
       for(int i=0;i<nums.length;i++){
       	System.out.print("nums["+i+"]=");
       	nums[i]=sc.nextInt();
       }
       System.out.println(Product.maxProduct(nums));
	}
}