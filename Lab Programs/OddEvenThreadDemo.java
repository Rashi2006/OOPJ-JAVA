class Even extends Thread{
   @Override
	public void run(){
    try{
    	int n=20;
    	for(int i=1;i<=20;i++){
    		if(i%2==0){
    			System.out.println(i);
    			sleep(1000);
    		}
    	}
    }catch(Exception e){
    	e.printStackTrace();
    }
	}


}
class Odd extends Thread{
	@Override
	public void run(){
    try{
    	int n=20;
    	for(int i=1;i<=20;i++){
    		if(i%2!=0){
    			System.out.println(i);
    			sleep(1000);
    		}
    	}
    }catch(Exception e){
    	e.printStackTrace();
    }
	}

}
public class OddEvenThreadDemo{
	public static void main(String [] args){
    
    Even n1 = new Even();
    Odd n2 = new Odd();

    n1.start();
    n2.start();
	}
}