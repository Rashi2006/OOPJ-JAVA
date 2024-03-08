import java.util.*;
class MaxFreqElements{
	
	int countMaxFreqElements(int [] nums){
		Arrays.sort(nums);
		
		int [] count = new int[nums.length];
		int k=0;
		
		//for counting frequencynof each element
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=(-1)){
              count[k]=1;
        	  for(int j=i+1;j<nums.length;j++){
        		if(nums[i]==nums[j]){
                    count[k]++;
                    nums[j]=-1;
        	    }
        	    else{
        	    	// System.out.println(count[k]);
        	    	k++;
        	    	
        	    	break;
        	    }
        	   }
            }
        }
        // for(int i=0;i<count.length;i++){
        //     System.out.println(i+"=="+count[i]);
        // }
        
        int max=0;
        int freqCount=0;
        //for finding max number 
        for(int i=0;i<count.length;i++){
                if(count[i]>max){
                   max=count[i];
        	    }
        }
        System.out.println(max);
        //for counting max freq
        for(int i=0;i<count.length;i++){
        	if(count[i]==max){
        		
                System.out.println(freqCount);
                freqCount+=max;
        	}
        }
        
        return freqCount;
	}
}
public class MaxFrequencyLeet{
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
       
       MaxFreqElements a1 = new MaxFreqElements();
       System.out.println("count="+a1.countMaxFreqElements(nums));
	}
}