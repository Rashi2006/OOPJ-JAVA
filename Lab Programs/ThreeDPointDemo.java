import java.util.Scanner;
class MyPoint{
	double x;
	double y;
	MyPoint(){
		this.x=0;
		this.y=0;
	}
	void getPointXY(double x , double y){
		
	}
	MyPoint(double x , double y){
		this.x=x;
		this.y=y;
	}
    double distance(MyPoint p2){
    	double d=Math.sqrt((Math.pow(p2.x,2))+(Math.pow(p2.y,2)));
    	return d;
    }
}
class ThreeDPoint extends MyPoint{
	double z;
	ThreeDPoint(){
		super();
		this.z=0;
	}
	ThreeDPoint(double x , double y , double z){
		super(x,y);
        this.z=z;
	}
	double getPointXY(double z){
		return z;
	}
	double distance(ThreeDPoint p2){
       double d=Math.sqrt((Math.pow(p2.x,2))+(Math.pow(p2.y,2))+(Math.pow(p2.z,2)));
       return d;
	}
}
public class ThreeDPointDemo{
	public static void main(String [] args){
      
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the location of point :");

    System.out.print("x=");
    double x=sc.nextDouble();

    System.out.print("y=");
    double y=sc.nextDouble();

    System.out.print("z=");
    double z=sc.nextDouble();

    ThreeDPoint p1 = new ThreeDPoint();
    ThreeDPoint p2 = new ThreeDPoint(x,y,z);
    
    double d=p1.distance(p2);
    System.out.println("Distance of a point from origin ="+d);
	}
	
}