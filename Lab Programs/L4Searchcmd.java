public class L4Searchcmd{
	public static void main(String [] args){
	  // System.out.println(args[0]);
	   if(args[0].charAt(0)>='A'&& args[0].charAt(0)<='Z'){
	   	System.out.println("True");
	   }else{
	   	System.out.println("The given string does not begins with uppercase.");
	   }
	}
}