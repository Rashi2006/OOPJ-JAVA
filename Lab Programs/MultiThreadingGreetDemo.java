class GM implements Runnable{
    public void run(){
    	try{
    		int n=0;
    	while(true){
    		System.out.println("Good Morning");
    		Thread.sleep(1000);
    		// n++;
    	}
    	}
    	catch(Exception e){
    		 e.printStackTrace();
    	}
    }
}
class GA implements Runnable{
    public void run(){
    	try{
    		int n=0;
    	while(true){
    		System.out.println("Good Afternoon");
    		Thread.sleep(3000);
    		n++;
    	}
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
public class MultiThreadingGreetDemo{
	public static void main(String [] args){
    
    GM a1 = new GM();
    GA a2 = new GA();

    Thread t1=new Thread(a1);
    t1.start();
    Thread t2=new Thread(a2);
    t2.start();
	}
}