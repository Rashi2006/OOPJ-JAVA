import java.io.*;
import java.util.Scanner;
public class ReplaceWordsFileDemo{
	public static void main(String [] args){
    
    Scanner sc = new Scanner(file);

    File f1 = new File(File1.txt);
    FileWriter f2 = new FileWriter(File2.txt);
     
    while(f1.hasNextLine()){
    	String [] words = sc.nextLine().split(" ");

    	for(int i=0;i<words.length;i++){
    		if(words[i])
    	}
    }
	}
}