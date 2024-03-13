abstract class Vegetable{
	String color;
	String vegname;

	abstract public String toString();
    
}
class Potato extends Vegetable{
	Potato(String name,String color){
       super.vegname=name;
       super.color=color;
	}
	public String toString(){
		return super.vegname+"_"+super.color;
	}
    
}
class Brinjal extends Vegetable{
	
	Brinjal(String name,String color){
	   super.vegname=name;
       super.color=color;
    }
    public String toString(){
		return super.vegname+"_"+super.color;
	}
   
}
class Tomato extends Vegetable{
	Tomato(String name,String color){
	   super.vegname=name;
       super.color=color;
    }
    public String toString(){
		return super.vegname+"_"+super.color;
	}
	

}

public class AbstractVegetable{
	public static void main(String [] args){

       Potato p = new Potato("Potato","Brown");
       System.out.println(p);
       Brinjal b= new Brinjal("Brinjal","Purple");
       System.out.println(b);
       Tomato t = new Tomato("Tomato","Red");
       System.out.println(t);
	}
}