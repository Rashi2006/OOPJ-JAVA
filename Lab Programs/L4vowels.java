import java.util.Scanner;
public class L4vowels{
	public static void main(String [] args){
	  System.out.println("Enter the string :");
	  Scanner sc=new Scanner(System.in);
	  String r=sc.nextLine();
	  int i,count=0,flag=0;
	  for(i=0;i<(r.length());i++){
	  	if(r.charAt(i)==('a')||r.charAt(i)==('e')||r.charAt(i)==('i')||r.charAt(i)==('o')||r.charAt(i)==('u')||r.charAt(i)==('A')||r.charAt(i)==('E')||r.charAt(i)==('I')||r.charAt(i)==('O')||r.charAt(i)==('U')){
	  		count++;
	  	}
	  	else if(r.charAt(i)==' '){
	  		
        }
        else{
	  		flag++;
	  	}
	  	}
	  	System.out.println("Vowels="+count);
	  System.out.println("Consonants="+flag);
	
  }
	  
}
