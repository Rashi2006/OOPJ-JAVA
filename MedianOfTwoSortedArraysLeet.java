import java.util.Scanner;
import java.util.Arrays;
class ShortedArray{
	static void Median(int []nums1, int []nums2){
         int []ans = new int[nums1.length + nums2.length];
         for(int i=0;i<nums1.length;i++){
            ans[i]=nums1[i];
         }
         int k=0;
         for(int i=nums1.length;i<ans.length;i++){
            ans[i]=nums2[k];
            k++;
         }
         Arrays.sort(ans);
         int r=ans.length/2;
         double median;
         if((ans.length%2)==0){
            median=((ans[r]+ans[r-1])/2.0);
            
         }
         else{
            median=ans[r];
            
         }
         System.out.println(median);

	}
}
public class MedianOfTwoSortedArraysLeet{
	public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    
    System.out.println("ENter the size of an Array1");
    int n=sc.nextInt();
    System.out.println("ENter the size of an Array2");
    int m=sc.nextInt();
    int [] nums1 =new int[n];
    int [] nums2 = new int[m];

      for(int i=0;i<n;i++){
        System.out.println("Enter nums1["+i+"]=");
       	nums1[i]=sc.nextInt();
      }
      for(int j=0;j<m;j++){
        System.out.println("Enter nums2["+j+"]=");
       	nums2[j]=sc.nextInt();
      }
    
    ShortedArray.Median(nums1,nums2);

	}
}