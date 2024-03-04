import java.util.Scanner;
class IntegerConverter{
    int romanToInt(String Roman){
      	int count=0;
         for(int i=(Roman.length()-1);i>=0;i--){
            switch(Roman.charAt(i)){
               case 'I': if(i < Roman.length()-1){
                             if(Roman.charAt(i+1)=='V' || Roman.charAt(i+1)=='X'){
                                 count--;
                             }else{
               	               count++;
               	           }
                          }else{
                                 count++;
                          }
               	       break;
               case 'V': count+=5;
                         break;
               case 'X': if(i < Roman.length()-1){
                             if(Roman.charAt(i+1)=='L' || Roman.charAt(i+1)=='C'){
                                 count-=10;
                             }else{
                                 count+=10;
                             }
                          }else{
                                 count+=10;
                          }
                         break;
               case 'L': count+=50;
                         break;
               case 'C': if(i < Roman.length()-1){
                             if(Roman.charAt(i+1)=='D' || Roman.charAt(i+1)=='M'){
                                 count-=100;
                             }else{
                                 count+=100;
                             }
                          }else{
                                 count+=100;
                          }
                         break;
               case 'D': count+=500;
                         break;
               case 'M': count+=1000;
                         break;
               default :System.out.println("Invalid input");
            }
         }
         return count;
      }
}
public class RomanToInteger{
	public static void main(String [] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the roman number:");
	  String Roman = sc.next();
     
     IntegerConverter converter = new IntegerConverter();
      int Integer = converter.romanToInt(Roman.toUpperCase()); // Calling the romanToInt method
        System.out.println("Integer=" + Integer); 
     
     // IntegerConverter Number1 = new IntegerConverter();
     // int inte=Number1.romanToInt(Roman);
     // System.out.println(Inte);
   }
}