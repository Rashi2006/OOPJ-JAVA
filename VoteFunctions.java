import java.util.Scanner;
public class VoteFunctions{
    public static boolean eligibility(int a){
      if(a>=18){
        return true;
      }else{
       return false;
      }
    }
	public static void main(String [] args){
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the age of the Person:");
	   int age=sc.nextInt();
       System.out.println(eligibility(age));
	}
}