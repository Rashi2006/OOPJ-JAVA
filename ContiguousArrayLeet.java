class ContiguousArray{///0101010
	
	public static int findMaxLength(int [] nums){

        for(int i=0;i<nums.length;i++){
        	if(i<=(nums.length-2)){
        		if(nums[i]==nums[i+1]){
                  
                }
                count++;
            }
           
        }
	}
}
public class ContiguousArrayLeet{
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

        System.out.println("MaxLength="+ ContiguousArray.findMaxLength(nums));
	}
}