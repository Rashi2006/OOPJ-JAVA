import java.util.Scanner;
public class L3max{
	public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b=sc.nextInt();
        System.out.println("Enter 3rd Number:");
        int c=sc.nextInt();

        if(a>b){
        	if(a>c){
        		System.out.println(a+ "is maximum");
        	}else{
        		System.out.println(c+ "is maximum");
        	}
        }else{
        	if(b>c){
        		System.out.println(b+ "is maximum");
        	}else{
        		System.out.println(c+ "is maximum");
        	}
        }
	}
}