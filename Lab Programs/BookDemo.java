class Book{
	private String author_name;
	Book(String au){
       this.author_name=au;
	}

	public void display(){
		System.out.println("author_name="+this.author_name);
	}
}
class Book_Publication extends Book{
	private String  Title;
    Book_Publication(String Title,String au){
    	super(au);
    	this.Title=Title;
    }
	public void display(){
        super.display();
        System.out.println("Title="+this.Title);
	}
}
class Paper_Publication extends Book{
	private String  Title;
    
    Paper_Publication(String Title,String au){
    	super(au);
    	this.Title=Title;
    }
    public void display(){
        super.display();
        System.out.println("Title="+this.Title);
	}
}
public class BookDemo{
	public static void main(String[] args){
	   Book b;//reference
	   
       if(args[0].equals("book")){
       	  b = new Book_Publication(args[1],args[2]);
       }else if(args[0].equals("paper")){
       	  b = new Paper_Publication(args[1],args[2]);
       }
       else{
       		b=  new Book(args[1]);
       }
       b.display();
	}
}