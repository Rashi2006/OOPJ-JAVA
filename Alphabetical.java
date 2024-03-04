public class Alphabetical{
	public static void main(String [] args){
	  String []name={"Rashi","Prashil","Vidisha","birva","Diya","Esha","prashi"};
      int size=name.length;
      String swap=null;
      for(int i=0;i<size;i++){
      	for(int j=(i+1);j<size;j++){
      		if(name[j].compareToIgnoreCase(name[i])<0){
      			swap=name[i];
      			name[i]=name[j];
      			name[j]=swap;

      		}
      	}
      }
      for(int i=0;i<size;i++){
      	System.out.println(name[i]);
      }
	}
}