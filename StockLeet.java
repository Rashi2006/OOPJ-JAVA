import java.util.Scanner;
class BuyAndsellStock{
   int maxProfit(int [] prices){
   	     int buyingPrice;
   	     int sellPrice;//2,3,4,9,1
   	     int profit;
         for(int i=0;i<prices.length;i++){
            for(int j=0;j<p)
         }
   }
}
public class StockLeet{
	public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       int i;//day number to buy stock
       System.out.println("Enter the number of days to buy stock");
       int x=sc.nextInt();
       int [] prices=new int[x];
       for(i=0;i<prices.length;i++){
          prices[i]=sc.nextInt();
       }
       BuyAndsellStock stock1 = new BuyAndsellStock();
       System.out.println("the profit is ="+ stock1.maxProfit(prices));
	}
}