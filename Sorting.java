public class Sorting{
	public static void main(String [] args){
	  int []num={12,17,9,8,10,14};
	  int n=num.length;
	  System.out.println("The given Number sequence is:");
	  for(int i=0;i<n;i++){
	  	System.out.print("num["+i+"]="+num[i]+" ");
	  }
	  //Shorting
	  //8,9,10,12,14,17
	  int temp;
	  for(int i=0;i<n;i++){
         for(int j=(i+1);j<n;j++){
         	if(num[i]>num[j]){
         		temp=num[i];
               num[i]=num[j];
               num[j]=temp;
         	}
         }
	  }
	  System.out.println("The sorted number sequence is:");
	  for(int i=0;i<n;i++){
	  	System.out.print("num["+i+"]="+num[i]+" ");
	  }
	}
}