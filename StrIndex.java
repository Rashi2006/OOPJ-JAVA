import java.util.Scanner;
public class StrIndex{;
public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	String r="She is pop very preptty!!";
	System.out.println("Enter the Element to be searched:");
	String p=sc.nextLine();
	int index = r.indexOf('p');
	System.out.println(index);
    System.out.println(r.indexOf('p',10));
    System.out.println(r.substring(16));
}
}