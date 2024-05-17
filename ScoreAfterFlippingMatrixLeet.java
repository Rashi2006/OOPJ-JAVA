import java.util.*;
class ScoreAfterFlippingMatrix{
	static int matrixScore(int[][] grid) {
        
    }
}
public class ScoreAfterFlippingMatrixLeet{
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

    System.out.println("maxNo="+ScoreAfterFlippingMatrix.matrixScore(A));
	}
}