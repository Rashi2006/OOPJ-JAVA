import java.util.Scanner;
 class RomanConverter{
	static String integerToRoman(int num){
        String r="";
        System.out.println(num);
        for(int i=0;num>0;i++){
           if(num>=1000){
           	  r=r+"M";
           	  System.out.println(i+" "+num);
           	  num=num-1000;
           }else if(num>=500){
           	    if(num>=900){
                    r+="CM";
                    System.out.println(i+""+num);
                    num-=900;
           	    }else{
           	    	r+="D";
           	    	System.out.println(i+""+num);
           	        num-=500;
           	    }
           	  
           }else if(num>=100){
           	    if(num>=400){
                    r+="CD";
                    System.out.println(i+""+num);
                    num-=400;
           	    }else{
           	    	r+="C";
           	    	System.out.println(i+""+num);
           	        num-=100;
           	    }
           	 
           }else if(num>=50){
           	    if(num>=90){
                    r+="XC";
                    System.out.println(i+""+num);
                    num-=90;
           	    }else{
           	    	r+="L";
           	    	System.out.println(i+""+num);
           	        num-=50;
           	    }
           	 
           }else if(num>=10){
           	    if(num>=40){
                   r+="XL";
                   System.out.println(i+""+num);
                   num-=40;
           	    }else{
           	       r+="X";
           	       System.out.println(i+""+num);
           	       num-=10;
           	    }
            }else if(num>=5){
           	    if(num>=9){
                   r+="IX";
                   System.out.println(i+""+num);
                   num-=9;
           	    }else{
           	       r+="V";
           	       System.out.println(i+""+num);
           	       num-=5;
           	    }
           	 
           }else if(num>=1){
           	    if(num==4){
           	   	   r+="IV";
           	   	   System.out.println(i+""+num);
           	   	   num-=4;
           	    }else{
           	       r+="I";
           	       System.out.println(i+""+num);
           	       num-=1;
           	    }
           }
        }
        return r;
	}
}
public class IntegerToRoman{
	public static void main(String [] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      
      System.out.println("Roman="+RomanConverter.integerToRoman(n));
	}
}