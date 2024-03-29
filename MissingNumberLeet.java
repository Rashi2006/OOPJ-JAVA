import java.util.*;
class MissingNumber{
	static int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
        	if(i!=nums[i]){
        		return i;
        	}
        }
        return nums.length;
    }
}
public class MissingNumberLeet{
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

        System.out.println("MissingNumber="+ MissingNumber.missingNumber(nums));
	}
}