import java.io.*;
public class FileInputOutputStreamDemo{
	public static void main(String [] args){
     
    try{
    	FileOutputStream fos = new FileOutputStream("File1.txt");
    	String s="Rashi is Very Prety";
    	byte [] b = s.getBytes();
    	fos.write(b);
    	fos.close();

        FileInputStream fis = new FileInputStream("File1.txt");
        int i;
        
        //for skip method
        // byte [] p = new byte[fis.available()];
        // while((i = fis.read())!=-1){
        //     char c = (char)i;
        //     System.out.println(c);
        //     fis.skip(2);
        // }
        
        //for int read(byte [] b , int off , int len):::::::::
        // byte [] p = new byte[fis.available()];
        // fis.read(p,0,10);
        // for(byte r : p){
        //      char ch = (char)r;
        //      System.out.print(ch);
        //  }

        //For int read(byte [] b)::::::::::::::::::::::::::::::
        // byte [] p = new byte[fis.available()];
        // fis.read(p);
        // for(byte r : p){
        //     char ch = (char)r;
        //     System.out.print(ch);
        // }


        // for read mthod::::::::
        // while((i=fis.read())!= -1){
        //     System.out.print((char)i);
        // }
        fis.close();
    }
    catch(Exception e){
    	e.printStackTrace();
    }
   
	}
}