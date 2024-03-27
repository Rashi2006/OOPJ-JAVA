import java.util.Scanner;
class MyPoint{
	int x;
	int y;
	MyPoint(){
		this.x=0;
		this.y=0;
	}
	void getPointXY(int x , int y){
		
	}
	MyPoint(int x , int y){
		this.x=x;
		this.y=y;
	}
    double distance(MyPoint p2){
    	double d=Math.sqrt((Math.pow(p2.x,2))+(int)(Math.pow(p2.y,2)));
    	return d;
    }
}
public class MyPointDemo{
	public static void main(String [] args){
    
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the location of point :");

    System.out.print("x=");
    int x=sc.nextInt();

    System.out.print("y=");
    int y=sc.nextInt();

    MyPoint p1 = new MyPoint();
    MyPoint p2 = new MyPoint(x,y);
    
    double d=p1.distance(p2);
    System.out.println("Distance of a point from origin ="+d);
	}
}