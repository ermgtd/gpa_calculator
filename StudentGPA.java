cd import java.util.Scanner;

public class StudentGPA {
  public static void main (String args[]){
    
    String grade = "";
    double credit1;
    double credit2;
    double credit3;
    double credit4;
    double gradeValue = 0;
    double tPtsClass1 = 0;
    double tPtsClass2 = 0;
    double tPtsClass3 = 0;
    double tPtsClass4 = 0;
    double tPts = 0;
    double tCred = 0;
    double gpa;
  
    Scanner console = new Scanner (System.in);
    System.out.println("Please enter the number of credits of the 1st class (a number)");
    credit1 = console.nextDouble();
    System.out.println("Please enter your grades for the 1st class (Capital letters only, ex: A, B, C)");
    grade = console.next();
  
    if (grade.equals ("A"))
      gradeValue = 4.00;
    else if (grade.equals ("A-"))
      gradeValue = 3.67;
    else if (grade.equals ("B+"))
      gradeValue = 3.33;
    else if (grade.equals ("B"))
      gradeValue = 3.00;
    else if (grade.equals ("B-"))
      gradeValue = 2.67;
    else if (grade.equals ("C+"))
      gradeValue = 2.33;
    else if (grade.equals ("C"))
      gradeValue = 2.00;
    else if (grade.equals ("D+"))
      gradeValue = 1.33;
    else if (grade.equals ("D"))
      gradeValue = 1.00;
    else if (grade.equals ("F"))
      gradeValue = 0;
    else
      System.out.println ("Invalid Grade");
  
    tPtsClass1 = gradeValue * credit1;
  
    
    System.out.println("Please enter the number of credits of the 2nd class (a number)");
    credit2 = console.nextDouble();
    System.out.println("Please enter your grades for the 2nd class (Capital letters only, ex: A, B, C)");
    grade = console.next();
  
    if (grade.equals ("A"))
      gradeValue = 4.00;
    else if (grade.equals ("A-"))
      gradeValue = 3.67;
    else if (grade.equals ("B+"))
      gradeValue = 3.33;
    else if (grade.equals ("B"))
      gradeValue = 3.00;
    else if (grade.equals ("B-"))
      gradeValue = 2.67;
    else if (grade.equals ("C+"))
      gradeValue = 2.33;
    else if (grade.equals ("C"))
      gradeValue = 2.00;
    else if (grade.equals ("D+"))
      gradeValue = 1.33;
    else if (grade.equals ("D"))
      gradeValue = 1.00;
    else if (grade.equals ("F"))
      gradeValue = 0;
    else
      System.out.println ("Invalid Grade");
  
    tPtsClass2 = gradeValue * credit2;
  
  
    System.out.println("Please enter the number of credits of the 3rd class (a number)");
    credit3 = console.nextDouble();
    System.out.println("Please enter your grades for the 3rd class (Capital letters only, ex: A, B, C)");
    grade = console.next();
  
    if (grade.equals ("A"))
      gradeValue = 4.00;
    else if (grade.equals ("A-"))
      gradeValue = 3.67;
    else if (grade.equals ("B+"))
      gradeValue = 3.33;
    else if (grade.equals ("B"))
      gradeValue = 3.00;
    else if (grade.equals ("B-"))
      gradeValue = 2.67;
    else if (grade.equals ("C+"))
      gradeValue = 2.33;
    else if (grade.equals ("C"))
      gradeValue = 2.00;
    else if (grade.equals ("D+"))
      gradeValue = 1.33;
    else if (grade.equals ("D"))
      gradeValue = 1.00;
    else if (grade.equals ("f"))
      gradeValue = 0;
    else
      System.out.println ("Invalid Grade");
  
    tPtsClass3 = gradeValue * credit3;
  
  
    System.out.println("Please enter the number of credits of the 4th class (a number)");
    credit4 = console.nextDouble();
    System.out.println("Please enter your grades for the 4th class (Capital letters only, ex: A, B, C)");
    grade = console.next();
  
    if (grade.equals ("A"))
      gradeValue = 4.00;
    else if (grade.equals ("A-"))
      gradeValue = 3.67;
    else if (grade.equals ("B+"))
      gradeValue = 3.33;
    else if (grade.equals ("B"))
      gradeValue = 3.00;
    else if (grade.equals ("B-"))
      gradeValue = 2.67;
    else if (grade.equals ("C+"))
      gradeValue = 2.33;
    else if (grade.equals ("C"))
      gradeValue = 2.00;
    else if (grade.equals ("D+"))
      gradeValue = 1.33;
    else if (grade.equals ("D"))
      gradeValue = 1.00;
    else if (grade.equals ("f"))
      gradeValue = 0;
    else
      System.out.println ("Invalid Grade");
  
    tPtsClass4 = gradeValue * credit4;
  
    
    tPts = tPtsClass1 + tPtsClass2 + tPtsClass3 + tPtsClass4;
    tCred = credit1 + credit2 + credit3 + credit4;
    gpa = tPts / tCred;
    
  
    System.out.printf("Your GPA is: %.2f/n", gpa);
    
  
    
  }
  
  
  
}
