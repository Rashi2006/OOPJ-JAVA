class A{
	String a="Rashi Faldu";
}
class B extends A{
    String a = "Rashi";
    String b;

    void print(){
    	System.out.println("this="+this.a+"____super="+super.a);
    }
}
public class SuperDemo{
	public static void main(String [] args){
        B obj = new B();
        obj.print();
	}
}