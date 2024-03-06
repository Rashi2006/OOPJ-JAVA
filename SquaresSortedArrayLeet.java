import java.util.Scanner;
import java.util.Arrays;
class SortedArraySquare{
	static void sortedSquares(double [] nums){
         for(int i=0;i<nums.length;i++){
         	nums[i]=Math.pow(nums[i],2);
         }
         Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
       	   System.out.println(" nums["+i+"]="+nums[i]);
       	  
        }
	}
}
public class SquaresSortedArrayLeet{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of an Array");
       int n=sc.nextInt();
       double []nums=new double[n];
       for(int i=0;i<n;i++){
       	System.out.println("Enter nums["+i+"]=");
       	nums[i]=sc.nextDouble();
       }
       SortedArraySquare n1 = new SortedArraySquare();
       n1.sortedSquares(nums);

	}
}