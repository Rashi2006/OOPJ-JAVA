import java.util.Scanner;
abstract class Vegetable{
	String color;
	
    abstract void display(String color);
}
class Potato extends Vegetable{
	Scanner sc=new Scanner(System.in);
	Potato(){
       System.out.println("Enter the name and color of Potato:");
       color = sc.nextLine();
       display(color);
	}
    void display(String color){
    	System.out.println(color);
    }
}
class Brinjal extends Vegetable{
	Scanner sc=new Scanner(System.in);
	Brinjal(){
		 System.out.println("Enter the name and color of Brinjal:");
         color = sc.nextLine();
         display(color);
    }
    void display(String color){
    	System.out.println(color);
    }
}
class Tomato extends Vegetable{
	Scanner sc=new Scanner(System.in);
    Tomato(){
		 System.out.println("Enter the name and color of Tomato:");
         color = sc.nextLine();
         display(color);
	}
	void display(String color){
    	System.out.println(color);
    }

}

public class AbstractVegetable{
	public static void main(String [] args){

       Potato v1 = new Potato();
       
       Brinjal v2= new Brinjal();
       
       Tomato v3= new Tomato();
       
	}
}