import java.util.Scanner;
class ComplexNumber{
    int real;
    int imaginary;
    
    ComplexNumber(int real , int imaginary){
       this.real=real;
       this.imaginary=imaginary;
    }
    void  addition(ComplexNumber C){
       int r = this.real + C.real;
       int i = this.imaginary + C.imaginary;
       System.out.println("the addition ="+r+"+"+i+"i");
    }
}
public class ComplexNumberDemo{
	public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the real number 1:");
      int r1 = sc.nextInt();
      System.out.println("Enter the imaginary number 1:");
      int i1=sc.nextInt();
      System.out.println("Enter the real number 2:");
      int r2 = sc.nextInt();
      System.out.println("Enter the imaginary number 2:");
      int i2=sc.nextInt();
      ComplexNumber C1 = new ComplexNumber(r1,i1);
      ComplexNumber C2 = new ComplexNumber(r2 ,i2);
      C1.addition(C2);
	}
}