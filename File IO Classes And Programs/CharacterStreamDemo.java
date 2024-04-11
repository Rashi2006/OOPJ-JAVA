import java.io.*;
public class CharacterStreamDemo{
	public static void main(String [] args){
    
    //Reader Class And Writer class
        try{
            Reader reader = new FileReader("ReadFile.txt");
            Writer writer = new FileWriter("WriteFile.txt");

            int a = reader.read();
            while(a!=-1){
            	writer.write((char)a);
            	a=reader.read();
            }
            reader.close();
            writer.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}