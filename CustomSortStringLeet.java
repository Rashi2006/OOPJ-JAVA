import java.util.Scanner;
class CustomSortString{
	static void sortString(String order , String s){
        StringBuilder sb = new StringBuilder("");
        StringBuilder s1 = new StringBuilder(s);
        for(int i=0;i<order.length();i++){
        	for(int j=0;j<s.length();j++){
        		if(order.charAt(i)==s.charAt(j)){
        			sb.append(s.charAt(j));
        			System.out.println(j+"_"+sb);
        			s1=s1.deleteCharAt(s.charAt(j));
        			System.out.println(j+"_"+s1);
        		}
        	}
        }
        System.out.println("sb="+sb+""+"s1="+s1);
        System.out.println(sb.append(s1));
	}
}
public class CustomSortStringLeet{
	public static void main(String [] args){
       Scanner sc =new Scanner(System.in);
       System.out.println("ENter the String Oredr:");
       String order=sc.nextLine();
       System.out.println("Enter the String s:");
       String s=sc.nextLine();
       CustomSortString.sortString(order,s);
	}
}