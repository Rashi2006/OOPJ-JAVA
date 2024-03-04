import java.util.Scanner;
public class L4HalfString{
	public static void main(String [] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String:");
	  String r=sc.nextLine();
	  int n=r.length();
      System.out.println("Length of String="+n);
      for(int i=n/2;i<n;i++){
      	System.out.print(r.charAt(i));
      }

	}
}