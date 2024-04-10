import java.io.*;
import java.util.Scanner;
class BinaryFile_Thread extends Thread{
	String fileName;
	BinaryFile_Thread(String fileName){
       this.fileName=fileName;
	}
	public void run(){
		try{
			FileInputStream fis = new FileInputStream(fileName);
			int temp = fis.read();
			while(temp>=0){
				System.out.println(temp);
				temp=fis.read();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
public class WriteBinaryFileMultiThreading{
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
    
    System.out.println("ENter the file Name:");
    String fileName=sc.nextLine();

    BinaryFile_Thread abc = new BinaryFile_Thread(fileName);
    abc.start();

    for(int i=0;i<1000;i++){
    	System.out.println("My main Thread is also running");
    }
	}
}