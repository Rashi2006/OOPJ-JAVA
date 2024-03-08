class Book{
	private String author_name;
	
	public String getAuthorName(String author_name){
          this.author_name=author_name;
	}
}
class Book_Publication extends Book{
	private String  Title;
    
	public getTitle(String Title){
        
	}
}
class Paper_Publication extends Book{
	private String  Title;
    public String getAuthorName(String author_name){

	}
    public String getTitle(String Title){

	}
}
public class BookDemo{
	public static void main(String[] args){
	   int temp = Int.parseInt(args[0]);
       if(temp==1){
       	Book b1 = new Book_Publication();
       }else{
       	Book b1 = new Paper_Publication();
       }
       b1.getAuthorName(args[1]);
	}
}