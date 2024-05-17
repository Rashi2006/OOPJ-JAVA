import java.util.Scanner;
class LargestLocalValesInMatrix{
    static int[][] largestLocal(int[][] grid) {
    	int n=grid.length;
        int [][] arr = new int[n-2][n-2];
        int [] largest = new int[(n-2)*(n-2)];
        int i=0;
        int m=0
        while(i<(n-2)){
        	while(m<(n-2)){
        		count=grid[i][m];
        		for(int j=i;j<n-2;j++){
          	        for(int k=m;k<n-2;k++){
                       if(count<=){
                       	 count=grid[j][k];
                       }
          	        }
                }
                largest[i][m]=count;
                m++;
        	}
            i++;
        }

        for(int j=0;j<)
    }
}
public class LargestLocalValesInMatrixLeet{
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);

	
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    int [][] A = new int[m][n];
    for(int i=0;i<n;i++){
    	for(int j=0;j<n;j++){
    		System.out.println("A["+i+"]["+j+"]=");
    		A[i][j]=sc.nextInt();
    	}
    }
    
    int [][] arr = LargestLocalValesInMatrix.largestLocal(A);
	}
}