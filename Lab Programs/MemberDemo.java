import java.util.Scanner;
class  Member{
	String Name;
	int Age;
	int PhoneNumber;
	String Address;
	Double Salary;

	Member(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the member:");
		this.Name=sc.nextLine();
		System.out.println("Enter the age of the member:");
		this.Age=sc.nextInt();
		System.out.println("Enter the Phone Number of the member:");
		this.PhoneNumber=sc.nextInt();
		System.out.println("Enter the Address of the member:");
		this.Address=sc.next();
		System.out.println("Enter the Salary of the member:");
		this.Salary=sc.nextDouble();
	}
}
class Employee extends Member{
	Scanner sc=new Scanner(System.in);
	String Specialization ;
	String Department;
    
    Employee(){
    	super();
    	System.out.println("Enter the Specialization of the Employee:");
    	this.Specialization=sc.nextLine();
    	System.out.println("Enter the Department of the Employee:");
    	this.Department = sc.nextLine();
    }
    void printEmployeeDetails(){
    	System.out.println("name="+Name);
    	System.out.println("age="+Age);
    	System.out.println("PhoneNumber="+PhoneNumber);
    	System.out.println("Address="+Address);
        System.out.println("Salary="+Salary);
        System.out.println("Specialization="+Specialization);
        System.out.println("Department="+Department);
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

	void printManagerDetails(){
    	System.out.println("name="+Name);
    	System.out.println("age="+Age);
    	System.out.println("PhoneNumber="+PhoneNumber);
    	System.out.println("Address="+Address);
        System.out.println("Salary="+Salary);
        System.out.println("Specialization="+Specialization);
        System.out.println("Department="+Department);
    }
}
public class MemberDemo{
	public static void main(String [] args){
       Employee E1 = new Employee();
       E1.printEmployeeDetails();
       Manager M1 = new Manager();
       M1.printManagerDetails();
	}
}