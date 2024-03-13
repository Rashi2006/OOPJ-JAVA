import java.util.Scanner;
class NumberOfGoodPairs{
	 static int goodPairs(int [] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
        	for(int j=i+1;j<nums.length;j++){
        		if(nums[i]==nums[j]){
        			count++;

        		}
        	}
        }
        return count;
	 }
}
public class NumberOfGoodPairsLeet{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter the size of an array:");
	int n=sc.nextInt();

	int [] nums=new int[n];

	for(int i=0;i<n;i++){
        System.out.println("Enter nums["+i+"]=");
       	nums[i]=sc.nextInt();
    }
    
    System.out.println("number of good pairs="+NumberOfGoodPairs.goodPairs(nums));
	}
}