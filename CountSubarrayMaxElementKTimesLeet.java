import java.util.Scanner;
class CountSubarrayMaxElementKTimes{
	static long countSubarrays(int[] nums, int k) {
        int count=0;
        long ans=0;
        int max=0;
        boolean isFound=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("max="+max);
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]==max){
                	System.out.println("1==="+nums[j]+"j="+j);
                    count++;
                    if(count>=k){
                    	isFound=true;
                    	System.out.println("2======"+nums[j]+"j="+j);
                        ans++;
                    }
                }else if(isFound){
                    	System.out.println("2======"+nums[j]+"j="+j);
                        ans++;
                }
            }
            System.out.println("************************************ans="+ans);
            count=0;
            isFound=false;
        }
        return ans;
    }
}
public class CountSubarrayMaxElementKTimesLeet{
	public static void main(String [] args){
	    Scanner sc=new Scanner(System.in);

        // System.out.println("Enter size of an array:");
	    // int n=sc.nextInt();

	    // int []nums = new int[n];

	    // System.out.println("Enter the array of numbers:");
       
        // for(int i=0;i<nums.length;i++){
       	//     System.out.print("nums["+i+"]=");
       	//     nums[i]=sc.nextInt();
        // } 
        
        int [] nums={61,23,38,23,56,40,82,56,82,82,82,70,8,69,8,7,19,14,58,42,82,10,82,78,15,82};
        System.out.println("Enter the value of k");
        int k = sc.nextInt();

        System.out.println("ans="+CountSubarrayMaxElementKTimes.countSubarrays(nums,k));
	}
}