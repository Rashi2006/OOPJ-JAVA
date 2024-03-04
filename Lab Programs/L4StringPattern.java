import java.util.Scanner;
public class L4StringPattern{
	public static void main(String [] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter The String");
	  String r=sc.next();
      for(int i=0;i<r.length();i++){
        for(int j=0;j<=i;j++){
          System.out.print(r.charAt(j));
        }
        System.out.print("\n");
      }
	}
}