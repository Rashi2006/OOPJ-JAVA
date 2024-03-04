import java.util.Scanner;
class Prefix{
	String longestCommonPrefix(String [] strs){
        StringBuilder prefix=new StringBuilder();
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[(strs.length()-1)];
        for(int i=0;i<Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return prefix.toString();
            }
                prefix.append(s1.charAt(i));
            }
            return prefix.toString();; 
        }
	// 	String r="";
	// 	String prefix="";

    //      for(int i=0;i<Math.min(strs[0].length(),strs[1].length());i++){
    //          	if(strs[0].charAt(i)==strs[1].charAt(i)){
    //                 r=append(r,strs[0].charAt(i));
    //          	}else{
    //          		break;
    //          	}
    //      }
        
    //     for(int i=0;i<Math.min(strs[2].length(),r.length());i++){
        	
    //     		if(strs[2].charAt(i)==r.charAt(i)){
    //                prefix=append(prefix,strs[2].charAt(i));
    //     		}else{
    //     			break;
    //     		}
    //     }
    //     if(prefix.equals("")){
    //         return null;
    //     }else{
    //     return prefix;
    //     }
	// }
    // int smallestOfTwoStrings(String a , String b ){
    //     if(a.length()>b.length()){
    //         return b.length();
    //     }else{
    //         return a.length();
    //     }
    // }
}
public class LongestCommonPrefix{
	public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      Prefix pre=new Prefix();
      String strs[] = new String[3];
      for(int i=0;i<3;i++){
      	System.out.println("Enter the String"+(i+1));
      	strs[i]=sc.next();
      }
      String prefix =pre.longestCommonPrefix(strs);
      System.out.println("Prefix="+prefix);
	}
}