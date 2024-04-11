import java.io.File;
public class FileDemo{
	public static void main(String [] args){
    
    File f = new File("PracticeFile.txt");
    
    //to check it file exists or not
    if(f.exists()){
    	System.out.println("Yes File Exists");
        
        //To check if it is file or folder
        //if FOLDER ---- Get listOf File inside it
    	if(f.isFile()){
    		System.out.println("It is a file");
    	}else if(f.isDirectory()){
            System.out.println("It is a Directory i.e. Folder");

            String [] ListOfFile = f.list();
            for(String i : ListOfFile){
            	System.out.println(i);
            }
    	}
        
        // to make sure the given path is absolute 
        if(f.isAbsolute()){
        	System.out.println("Absolute Path");
        }else{
        	System.out.println(f.getAbsolutePath());
        }

        //is file readable and writeable ??
        if(f.canRead()){
        	System.out.println("can Read");
        }
        if(f.canWrite()){
        	System.out.println("Can Write");
        }


        //To get Length of file and LastModified
        System.out.println("Length of File="+f.length());
        System.out.println("Last Modified:"+f.lastModified());
    }else{
    	System.out.println("File Does not exist");
    }
	}
}