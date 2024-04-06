import java.util.Scanner;
class Row extends Thread{
	int [] A;
	int rowNo;
	 Row(int A[] , int rowNo){
       this.rowNo=rowNo;
       this.A=A;
	 }
	 public void run(){
     try{
     	int count=0;
     	
          for(int i=0;i<A.length;i++){
             count+=A[i];
          }
          System.out.println("Sum of Row"+rowNo+"="+count);
          sleep(1000);
     	
     }catch(Exception e){
       e.printStackTrace();
     }
	}
}
public class MatrixThreadDemo{
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
    
    Row [] r = new Row[m];

    for(int i=0;i<m;i++){
    	r[i]=new Row(A[i],i);

    	r[i].start();
    }
	}
}