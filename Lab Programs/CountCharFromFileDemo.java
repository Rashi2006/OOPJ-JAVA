import java.io.*;
import java.util.Scanner;
public class CountCharFromFileDemo{
	public static void main(String [] args){
    int countLine=0;
    int charCount=0;
    int wordCount=0;
    try{
    	
    	File file = new File("Rashi.txt");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
        	String line = sc.nextLine();
            countLine++;
       		for(int i=0;i<line.length();i++)
       		{
       			if(line.charAt(i)!=' '){
              		charCount++;
            	}
       		}
            
            
            String arr[]=line.split(" ");
            wordCount+=arr.length;
        }
        
        	System.out.println("Line="+countLine);
        	System.out.println("Char="+charCount);
        	System.out.println("words="+wordCount);
        
    }
    catch(Exception e){
        e.printStackTrace();
    }
	}
}