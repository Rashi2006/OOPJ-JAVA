class RepetitiveMultiplication{
   
    int multiplication(int x,int y){
    	int r=x*y;
    	return r;
    }

}
public class RepetitiveMultiplicationDemo{
	public static void main(String [] args){
     
    try{
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);

	RepetitiveMultiplication a1 = new RepetitiveMultiplication();
    System.out.println("x*y="+a1.multiplication(x,y));
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index out of bound");
    }
    catch(NumberFormatException e){
        System.out.println("invalid input");
    }
    catch(Exception e){
    	System.out.println("Exception");
    }
    
	}
}