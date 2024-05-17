import java.util.Scanner;
class StringCompression{
	 static int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        StringBuilder s = new StringBuilder("");
        int count=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
                if(i==chars.length-1){
                    s.append(chars[i]);
                    if(count!=1){
                    s.append(count);
                    }  
                }
            }else{
                s.append(chars[i-1]);
                if(count!=1){
                    s.append(count);
                }
                count=1;
                if(i==chars.length){
                    s.append(chars[i]);
                }
            }
        }
        System.out.println(s);
        return s.length();
    }
}
public class StringCompressionLeet{
	public static void main(String [] args){
       Scanner sc =new Scanner(System.in);
       
       System.out.println("Enter the size of an array:");
       int n=sc.nextInt();
       char [] chars = new char[n];
       for(int i=0;i<n;i++){
        System.out.println("chars["+i+"]=");
        chars[i]=sc.next().charAt(0);
       }
       System.out.println("ans="+StringCompression.compress(chars));
	}
}