import java.util.*;
class IntersectionOfTwoArrays{
	static void intersection(int [] nums1 , int [] nums2){
        HashSet<Integer>nums=new HashSet<>();
        if(nums1.length>nums2.length){
            for(int i=0;i<nums1.length;i++){
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        nums.add(nums1[i]);
                    }
                }
            }
        }else{
            for(int i=0;i<nums2.length;i++){
                for(int j=0;j<nums1.length;j++){
                    if(nums2[i]==nums1[j]){
                        nums.add(nums2[i]);
                    }
                }
            }
        }
        
        Integer []nums3= nums.toArray(new Integer[nums.size()]);
        int [] nums4=new int[nums3.length];
        
        
        for(int i=0;i<nums4.length;i++){
          nums4[i]=nums3[i];
        }
        for(int i=0;i<nums4.length;i++){
          System.out.println(nums4[i]);
        }
	}
}
public class IntersectionOfTwoArraysLeet{
	public static void main(String [] args){
	  Scanner sc = new Scanner(System.in);

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

    IntersectionOfTwoArrays.intersection(nums1 , nums2);
	}
}