import java.util.Scanner;
class DuplicateElements{
	int removeDuplicates(int [] nums){//0011122334
       
        int k=0;
        for(int i=1;i<nums.length;i++){
           if(nums[k]!=nums[i]){
               k++;
               nums[k]=nums[i];
               
           }
        }
        return k+1;
    }
	}

public class RemoveEDuplicateElementLeet{
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
       
       DuplicateElements A1 = new DuplicateElements();
       System.out.println("Total unique elements ="+A1.removeDuplicates(nums));
    }
}
 