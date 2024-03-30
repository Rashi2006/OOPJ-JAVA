class Negative extends Exception{
	Negative(String str){
		Super(str);
	}
}

public class NIntegerExceptionDemo{
	public static void main(String [] args){
    
    int n= Integer.parseInt(args[0]);
    int i=0;
    int j=1;
    int [] arr = new int[n];
    try{
      while(i<n){
        arr[i] = Integer.parseInt(args[j]);
        if(arr[i]<0){
        	throw new Negative("iufhegwflei");
        }
        i++;
        j++;
      }
    }catch(Exception e){
    	System.out.println(e.getMessage());
    }
    

	}
}