package task3;

import java.util.Scanner;

public class StudentGradeMarks {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
      System.out.println("==================WELCOME STUDENT GRADE CALCULATOR====================");
      System.out.println("======================================================================");
      System.out.println("Enter The Numbers Of Grades");
      int grades =in.nextInt();
      int arr[] = new int[grades];
      
      int grade=1;
      for(int i=0;i<grades;i++) {
    	  System.out.println("Enter The Grade Marks: "+grade);
    	  arr[i]=in.nextInt();
    	  grade++;
    	  
      }
          
      int total=0;
      for(int i=0;i<grades;i++) {
    	  total=arr[i]+total;
      }
      
      double avg =(double) total/grades;
      System.out.println("Your Average Of Grade ="+avg);
      
	}

}
