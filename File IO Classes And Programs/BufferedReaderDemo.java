import java.io.*;
public class BufferedReaderDemo{
	public static void main(String [] args){
    
    try{
    	
        FileReader f = new FileReader("BufferedReader.txt");
        
	    BufferedReader br = new BufferedReader(f);
	    
	    while(br.ready()){
	    	System.out.println(br.readLine());
	    }
	    

    }catch(Exception e){
    	e.printStackTrace();
    }
	
	}
}