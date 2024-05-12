import java.util.Scanner;
public class Practice{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int c=1;
        try{
            Scanner rf = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            c=a/b;
        }catch(Exception e){
            System.out.println(c);
        }finally{
            System.out.println(c);
        }
    }
}   