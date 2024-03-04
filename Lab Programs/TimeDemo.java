import java.util.Scanner;
class Time{
      int hour;
      int min;
      Time(){
        this.hour=2;
        this.min=30;
      }
      Time(int hour,int min){
         this.hour=hour;
         this.min=min;
      }
      void timeAddition(Time t1){
          int h=this.hour+t1.hour;//this vadu che e object no time(default vado time)show kare and t1 vadu pass karelo time show karse
          int m=this.min+t1.min;
          if(m>=60){
            h++;
            m-=60;
          }
          System.out.println(h+"hours"+m+"minutes");
      }
}
public class TimeDemo{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      Time t1=new Time();
      System.out.println("Enter hours:");
      int h=sc.nextInt();
      System.out.println("Enter minutes:");
      int m=sc.nextInt();
      Time t2=new Time(h,m);
      t1.timeAddition(t2);//t1=object this ma eno time avse
      
   }
}