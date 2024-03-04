import java.util.Scanner;
class Student{
	int id_no;
	int no_of_subjects_registered;
    int[] subject_code;
    double[] subject_credits;
    String[] grade_obtained;
    double spi;
    Student(int i){
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter the Student id_no of Student"+i);
       id_no=sc.nextInt();

       System.out.println("Enter no of subjects registered of Student"+i);
       no_of_subjects_registered=sc.nextInt();

       subject_code=new int[no_of_subjects_registered];

       for(int j=0;j<subject_code.length;j++){
       	System.out.println("Enter subject code of subject"+j);
       	this.subject_code[j]=sc.nextInt();
       }
       
       subject_credits=new double[no_of_subjects_registered];

       for(int j=0;j<subject_code.length;j++){
       	System.out.println("Enter subject credits of subject"+j);
       	this.subject_credits[j]=sc.nextDouble();
       }
       
       grade_obtained=new String[no_of_subjects_registered];

       for(int j=0;j<subject_code.length;j++){
       	System.out.println("Enter grade obtained of subject"+j);
       	this.grade_obtained[j]=sc.nextLine();
       }
      
    }
    double calculate_spi(){
    	return 0;
    }
}
public class StudentInfo{
	public static void main(String [] args){
	  
	  int n = Integer.parseInt(args[0]);
      Student[] stu = new Student[n];
      for(int i=0;i<n;i++){
        stu[i]=new Student(i);
      }
      
      for(int i=0;i<n;i++){
      	System.out.println("spi of Student"+i+"="+stu[i].calculate_spi());

      }
	}
}