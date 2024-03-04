import java.util.Scanner;
class LowerCase{
	String s;
	String toLowerCase(String s){
		StringBuilder s1 = new StringBuilder(s);
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)>=65 && s1.charAt(i)<=90){
				s1.setCharAt(i,(char)((int)s1.charAt(i)+32));
			}
		}
		return s1.toString();
	   // int i=0;
	   // int a;
	   // char p;
	   // String r="";
       // while(i<s.length()){
       // 	 a=s.charAt(i);
       //   if(a>=97 && a<=122){
       //      r=r+s.charAt(i);
       //   }else if(a>=65 && a<=90){
       //        a+=32;
       //        p=(char)a;
       //        r+=p;
       //    }else{
       //        r+=s.charAt(i);
       //    }
       //   i++;
       // }
       // return r;
	}
}
public class toLowerCaseLeet{
	public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("ENter the String");
      LowerCase s1 = new LowerCase();
      s1.s=sc.nextLine();
      System.out.println("String in lower case ="+s1.toLowerCase(s1.s));
      
      
	}
}