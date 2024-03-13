interface A{
   final int A=10;
   void mA();
}
interface A1 extends A{
   final int A1=20;
   void mA1();
}
interface A2 extends A{
   final int A2=30;
   void mA2();
}
interface A12 extends A2 ,A1{
   final int A12=40;
   void mA12();
}
class B implements A12{
   public void mA(){
   	System.out.println(A);
   }
   public void mA1(){
   	System.out.println(A1);
   }
   public void mA2(){
   	System.out.println(A2);
   }
   public void mA12(){
   	System.out.println(A12);
   }
}
public class InterfaceDemo{
	public static void main(String [] args){
      B obj1 = new B();
      obj1.mA();
      obj1.mA1();
      obj1.mA2();
      obj1.mA12();
	}
}