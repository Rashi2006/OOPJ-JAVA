import java.util.Scanner;
class ValidParenthesis{
	static boolean checkValidString(String s) {
        char a='(';
        char b=')';
        char c='*';
        int count=0;
        int flag=0;
        int star=0;
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)==a){
        		count++;
        	}else if(s.charAt(i)==b){
                flag++;
        	}else if(s.charAt(i)==c){
        		star++;
        	}
        }
        System.out.println(count + "$$$$$" + flag +"$$$$"+star);
        if(count == flag){
        	System.out.println("1");
        	return true;
        }else if((count!=0 && (flag+star)==0) || (flag!=0 && (count+star)==0)){
        	System.out.println("2");
            return false;
        }else if(count<=(flag+star) || flag<=(count+star)){
        	System.out.println("3");
        	return true;
        }
        else{
        	return false;
        }
    }
}
public class ValidParenthesisLeet{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the String");
	String s = sc.next();
    
    System.out.println("Ans="+ValidParenthesis.checkValidString(s));
	}
}