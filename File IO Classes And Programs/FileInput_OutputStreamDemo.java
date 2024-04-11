import java.io.*;
public class FileInput_OutputStreamDemo{
	public static void main(String [] args){
    
    try{
    	FileInputStream fis = new FileInputStream("ReadFile.txt");
        FileOutputStream fos = new FileOutputStream("WriteFile.txt");

        //to write something into fos file using byte array
        String s = "Thought I follow:";
        byte [] b = s.getBytes();
        fos.write(b);

        //fis read() one char
        int a = fis.read();
        System.out.println((char)a);
	    
	    //read whole file and write to another file
	    while(a!=-1){
	    	fos.write((char)a);
	    	a=fis.read();
	    }
        fos.close();
    	fis.close();
    }
    catch(Exception e){
    	e.printStackTrace();
    }
    } 
}