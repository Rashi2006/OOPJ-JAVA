class Negative extends Exception{
	Negative(String str){
		super(str);
	}
}
class NumberGreaterThan1000 extends Exception{
  NumberGreaterThan1000(String str){
    super(str);
  }
}
class NumberGreaterThan7000 extends Exception{
  NumberGreaterThan7000(String str){
    super(str);
  }
}
public class NIntegerExceptionDemo{
	public static void main(String [] args){
    
    int n= Integer.parseInt(args[0]);
    
    int j=1;
    int [] arr = new int[n];
    int count =0;
    try{
      for(int i=0;i<n;i++,j++){
        arr[i] = Integer.parseInt(args[j]);
        if(arr[i]<0){
        	throw new Negative("The Number is negative");
        }else if(arr[i]>1000 && arr[i]<2000){
          throw new NumberGreaterThan1000("The number is greater than 1000 and less than 2000");
        }else if(arr[i]>7000){
          throw new NumberGreaterThan1000("The number is greater than 7000");
        }
        
        count += arr[i];
      }
      System.out.println("addition="+count);
    }catch(Exception e){
    	System.out.println(e.getMessage());
    }
    

	}
}