import java.util.Scanner;
class Vowel{
	static int a;
	static int e;
	static int o;
	static int i;
	static int u;
	
	static void countVowel(String sentence){
	  String r=sentence.toLowerCase();
	  
      for(int i=0;i<r.length();i++){
	  	switch(r.charAt(i)){
	  	  case 'a':a++;
	  	  	       break;
	  	  case 'e':e++;
	  	  	       break;
	  	  case 'i':i++;
	  	  	       break;
	  	  case 'o':o++;
	  	  	       break;
	  	  case 'u':u++;
	  	  	       break;
	  	  default :continue;	       
	  	}
	  }
      
	}

}
public class CountOfVowel{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in); 
		while(true){
			System.out.println("Enter the Sentence and enter quit at the end to terminate the Sentence:");
            String sen=sc.nextLine();
			
			if(sen.equals("quit")){
				break;
			}else{
				Vowel v = new Vowel();
				v.countVowel(sen);
			}
		}
		System.out.println(Vowel.a+","+Vowel.e+","+Vowel.i+","+Vowel.o+","+Vowel.u);
	}

}