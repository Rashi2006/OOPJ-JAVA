import java.util.Scanner;
class SearchIndexPosition{
	static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==target){//1,3,4,5,6
        		return i;
        	}
        }
        if(nums.length==1){
        	if(target>nums[0]){
        		return 1;
        	}else{
        		return 0;
        	}
        }
        for(int i=0;i<nums.length;i++){
            if(i<(nums.length-1)){
            	System.out.println("1");
        	    if(target>nums[i] && target <nums[i+1]){
        	    	return i+1;
                }else if(target<nums[i]){
                	return i;
                }
        	}else{
        		System.out.println("2");
        		return i+1;
        		
        	}
        }
        return 00;
    }
}
public class SearchIndexPositionLeet{
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
        
        System.out.println("Enter Target:");
	    int target=sc.nextInt();

	    System.out.println("Index="+SearchIndexPosition.searchInsert(nums,target));
	}
}