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
       //id_no
       System.out.println("Enter the Student id_no of Student"+i);
       id_no=sc.nextInt();
       //no_of_sub_registered
       System.out.println("Enter no of subjects registered of Student"+i);
       no_of_subjects_registered=sc.nextInt();
       //sub code
       subject_code=new int[no_of_subjects_registered];

       for(int j=0;j<subject_code.length;j++){
       	System.out.println("Enter subject code of subject"+j);
       	this.subject_code[j]=sc.nextInt();
       }
       //sub credits
       subject_credits=new double[no_of_subjects_registered];

       for(int j=0;j<subject_code.length;j++){
       	System.out.println("Enter subject credits of subject"+j);
       	this.subject_credits[j]=sc.nextDouble();
       }
       //grade
       grade_obtained=new String[no_of_subjects_registered];

       for(int j=0;j<subject_code.length;j++){
       	System.out.println("Enter grade obtained of subject"+j);
       	this.grade_obtained[j]=sc.next();
       }
       //spi
       spi=calculate_spi(subject_credits , grade_obtained);
 
    }
    double calculate_spi(double []subject_credits , String [] grade_obtained){
      double num=0 ;
      double deno=0;
      
      for(int i=0;i<subject_credits.length;i++){
          deno+=subject_credits[i];
          if(grade_obtained[i].equals("A+")){
             num+=subject_credits[i]*10;
          }else if(grade_obtained[i].equals("A")){
             num+=subject_credits[i]*9;
          }else if(grade_obtained[i].equals("B")){
             num+=subject_credits[i]*8;
          }else if(grade_obtained[i].equals("C")){
             num+=subject_credits[i]*7;
          }
      }
      return num/deno;
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
      	System.out.println("spi of Student"+i+"="+stu[i].spi);

      }
	}
}