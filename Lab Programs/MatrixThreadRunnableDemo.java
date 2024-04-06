import java.util.Scanner;
class RowSum implements Runnable{
    int [] rows;
    int sum=0;

    public RowSum(int [] rows){
        this.rows=rows;
    }
    public void run(){
        try{
            for(int i=0;i<rows.length;i++){
                sum+=rows[i];
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public int printSum(){
        return sum;
    }
}
public class MatrixThreadRunnableDemo{
	public static void main(String [] args){
	
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of m:");
    int m=sc.nextInt();
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    int [][] A = new int[m][n];
    for(int i=0;i<m;i++){
    	for(int j=0;j<n;j++){
    		System.out.println("A["+i+"]["+j+"]=");
    		A[i][j]=sc.nextInt();
    	}
    }

    RowSum [] thread = new RowSum[m];
    Thread [] t = new Thread[m];
    

    for(int i=0;i<m ; i++){
        for(int j=0;j<n;j++){
            thread[i]= new RowSum(A[i]);
            t[i]=new Thread(thread[i]);
            t[i].start();
        }
    }
    System.out.println("Sum of each row:");
    for(int i=0;i<m ; i++){
        System.out.println("row"+i+"="+thread[i].printSum());
    }
    }
}