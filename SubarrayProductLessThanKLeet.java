public class SubarrayProductLessThanKLeet{
	public static void main(String [] args){
     int [] nums ={10,9,10,4,3,8,3,3,6,2,10,10,9,3};
     int k=19;
	 int count=0;
	    if(k==0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    count++;
                }
            }
            if(count==0){
                return 0;
            }else{
                count=0;
            }
        }
        for(int i=0;i<nums.length;i++){
            long r=nums[i];
            if(r<k){
            	System.out.println("R1="+r);
                count++;
            }
            for(int j=(i+1);j<nums.length;j++){
                r*=nums[j];
                if(r<k){
                	System.out.println("R2="+r);
                    count++;
                }
            }
            System.out.println(count);
        }
	}
}