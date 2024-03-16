import java.util.Scanner;
class BinarySubarraysWithSum{
    static int subArray(int[] nums, int goal){
       int count=0;
       int sum=0;
       for(int i=0;i<nums.length;i++){
       	 for(int j=i;j<nums.length;j++){

       	 	sum+=nums[j];
       	 	System.out.println("i="+i+"j="+j+"sum="+sum);
       	 	if(sum==goal){
       	 		count++;
       	 		System.out.println("count="+count);
       	 	}
       	 }
       	 sum=0;
       	 System.out.println("********");
       }
       return count;
    }
}
public class BinarySubarraysWithSumLeet{
	public static void main(String [] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("ENter the size of an array:");
	int n=sc.nextInt();

	int [] nums=new int[n];

	for(int i=0;i<n;i++){
        System.out.println("Enter nums["+i+"]=");
       	nums[i]=sc.nextInt();
    }

    System.out.println("Enter the goal");
    int goal=sc.nextInt();

    System.out.println("n="+BinarySubarraysWithSum.subArray(nums,goal));
	}
}