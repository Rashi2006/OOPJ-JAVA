import java.util.Scanner;
class Bank_Account{
	int accountNo;
	String userName;
	String email;
	String accountType;
	double accountBalance;
	void getAccountDetails(String userName , String email , String accountType,double accountBalance){
       this.userName=userName;
       this.email=email;
       this.accountType=accountType;
       this.accountBalance=accountBalance;
    }
	void displayAccountDetails(){
       System.out.println("Username:"+this.userName);
       System.out.println("Email:"+this.email);
       System.out.println("accountType:"+this.accountType);
       System.out.println("accountBalance:"+this.accountBalance);
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
public class AccountDemo{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		Bank_Account person1 = new Bank_Account();
		Bank_Account person2 = new Bank_Account();
		System.out.println("Enter the username:");
		person1.userName=sc.nextLine();
		System.out.println("Enter the email add. :");
		person1.email=sc.nextLine();
		System.out.println("Enter the accountType:");
		person1.accountType=sc.nextLine();
		System.out.println("Enter the accountBalance:");
		person1.accountBalance=sc.nextDouble();
		person1.getAccountDetails(person1.userName,person1.email,person1.accountType,person1.accountBalance);
		person1.displayAccountDetails();
        
        
	}
}