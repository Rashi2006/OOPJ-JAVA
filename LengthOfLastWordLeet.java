import java.util.Scanner;
class LengthOfLastWord{
	static int lengthOfLastWord(String s) {
        int count=0;
        
        for(int i=(s.length()-1);i>=0;i--){
        	if(s.charAt(i)!=' '){
        		count++;
        	}else{
        		System.out.println("count="+count);
        		break;
        	}
        }
        return count;
    }
}
public class LengthOfLastWordLeet{
	public static void main(String [] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the String:");
    String s=sc.nextLine();

    System.out.println("Length of last word ="+LengthOfLastWord.lengthOfLastWord(s));
	}
}