import java.util.HashSet;
import java.util.Scanner;
class ContainsDuplicate{
	
    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.size()==nums.length){
            return false;
        }else{
            return true;
        }
    }
}
public class ContainsDuplicateLeet{
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

        System.out.println(ContainsDuplicate.containsDuplicate(nums));
	
	}
}