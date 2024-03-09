import java.util.*;
class MinimumCommonValue{
	static int commonValue(int []nums1 , int []nums2){
      // int []count=new int[Math.max(nums1.length,nums2.length)];
      // int k=0;
      
      for(int i=0;i<Math.max(nums1.length,nums2.length);i++){
      	for(int j=0;j<Math.min(nums1.length,nums2.length);j++){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
      	}
      } 
      return -1;
      

      
      // for(int i=0;i<count.length;i++){
      // 	if(count[i]!=0){
      // 		return count[i];
      // 	}
      // }
      // return -1;

   
	}
}
public class MinimumCommonValueLeet{
	public static void main(String [] args){
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

      System.out.println(MinimumCommonValue.commonValue(nums1 ,nums2));
	}
}