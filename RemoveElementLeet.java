import java.util.Scanner;
import java.util.Arrays;
class RemoveElement{
   
	int removeElement(int[] nums, int val){
		int k=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				nums[k++]=nums[i];
			}
		}
		return k;
	}
	
}
public class RemoveElementLeet{
	public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of an array:");
	   int n=sc.nextInt();
	   int []nums = new int[n];
	   System.out.println("Enter the array of numbers:");
       for(int i=0;i<nums.length;i++){
       	System.out.print("nums["+i+"]=");
       	nums[i]=sc.nextInt();
       }

       System.out.println("Enter the number to be removed from the array:");
       int val=sc.nextInt();
       
       RemoveElement k = new RemoveElement();
       
       System.out.println("number of elements in the array that are not equal to val="+k.removeElement(nums,val));
	}
}