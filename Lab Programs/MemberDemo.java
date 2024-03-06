import java.util.Scanner;
class  Member{
	String Name;
	int Age;
	int PhoneNumber;
	String Address;
	Double Salary;
	void printSalary(double salary){
         
	}
	Member(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the member:");
		this.Name=sc.nextLine();
		System.out.println("Enter the age of the member:");
		this.Age=sc.nextInt();
		System.out.println("Enter the Phone Number of the member:");
		this.PhoneNumber=sc.nextInt();
		System.out.println("Enter the Address of the member:");
		this.Address=sc.nextLine();
		System.out.println("Enter the Salary of the member:");
		this.Salary=sc.nextDouble();
	}
}
class Employee extends Member{
	Scanner sc=new Scanner(System.in);
	String Specialization ;
	String Department;
    
    Employee(){
    	System.out.println("Enter the Specialization of the Employee:");
    	this.Specialization=sc.nextLine();
    	System.out.println("Enter the Department of the Employee:");
    	this.Department = sc.nextLine();
    }

}
class Manager extends Member{
	Scanner sc=new Scanner(System.in);
	String Specialization ;
	String Department;
	Manager(){
		System.out.println("Enter the Specialization of the Employee:");
    	this.Specialization=sc.nextLine();
    	System.out.println("Enter the Department of the Employee:");
    	this.Department = sc.nextLine();
	}
}
public class MemberDemo{
	public static void main(String [] args){
       Employee E1 = new Employee();

       Manager M1 = new Manager();
	}
}