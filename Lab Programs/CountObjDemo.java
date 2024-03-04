class CountObj{
	static int count ;
	CountObj(){
		count++;
	}
	static void printCount(){
		System.out.println(count);
	}
}
public class CountObjDemo{
	public static void main(String [] args){
    
    CountObj a1 = new CountObj();
    CountObj a2 = new CountObj();
    CountObj a3 = new CountObj();
    CountObj.printCount();
	}
}