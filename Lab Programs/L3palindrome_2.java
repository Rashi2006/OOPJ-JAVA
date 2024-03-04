import java.util.Scanner;
public class L3palindrome_2{
	public static void main(String [] args){
	   Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the String:");
	    String r=sc.next();
	    String p="";
	    int i,k=r.length();
        for(i=(k-1);i>=0;i--){
          p=p+r.charAt(i);
        }
        if(r.equals(p)){
        	System.out.println("Palindrome String");
        }else{
        	System.out.println("Not Palindrome String");
        }
	}
}