import java.util.Scanner;
class Digits{
	void plusOne(int []digits){
		for(int i=(digits.length-1);i>=0;i--){
       	    if(digits[i]<9){
                 digits[i]=digits[i]+1;
                 for(int j=0;j<digits.length;j++){
                 	System.out.println("digits["+j+"]="+digits[j]);
                 }
                 return;
       	    }else{
       	    	digits[i]=0;
       	    }
       }
       digits=new int[digits.length+1];
       digits[0]=1;

       for(int j=0;j<digits.length;j++){
            System.out.println("digits["+j+"]="+digits[j]);
        }
       return ;
	}
}
public class PlusOneLeet{
	public static void main(String [] args){
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of an array:");
	   int x=sc.nextInt();
	   int []digits = new int[x];
	   System.out.println("Enter the array of numbers:");
       for(int i=0;i<digits.length;i++){
       	System.out.print("digits["+i+"]=");
       	digits[i]=sc.nextInt();
       }
       
       Digits n1 = new Digits();
       n1.plusOne(digits);
       // for(int i=0;i<n1.plusOne(digits).length;i++){
       // 	 System.out.println("digits["+i+"]="+n1.plusOne(digits)[i]);
       // }
       

	}
}