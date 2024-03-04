public class CountPrimeLeet{
	public static void main(String [] aergs){
	 int n=10;
	 int j=2;
	 int i=2;
	 int count=0;
	 int x=0;
	 while(j<n){
        if(j==2){
        	System.out.println(j);
        	count++;
        	
        }else{
	        while(i<=Math.sqrt(j)){
               if(j%i==0){
                	x++;
                	break;
               }

               i++;
	        }
	        
	        if(x==0){
	        	System.out.println(j);
	        	count++;
	        }
	        i=2;
	    }
	    
	    j++;
	    x=0;
    }
     System.out.println(count);
    }
} 