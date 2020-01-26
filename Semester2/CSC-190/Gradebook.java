import java.util.Scanner;
public class Gradebook
{
    
public static void main (String [] args)
{
    
Scanner in = new Scanner(System.in);
    
System.out.println("How many students do you have in your class?");
int students = in.nextInt();
System.out.println();

String [] arrStudents = new String [students] ;

System.out.println("How many assignments does each student have?");
int grades = in.nextInt();
System.out.println();
   
int [][] arrGrades = new int [students][grades];   
    
    for (int i=0; i<students; i++)
    {
    System.out.println("Enter student " + (i+1) + "'s name:") ;   
    arrStudents[i]=in.next();
    }

System.out.println();

boolean done = false;;

    while (!done)
    {
    
    System.out.println("Pick an option:");
    System.out.println("1. Modify Student Names.");
    System.out.println("2. Enter grades for an assignment.");
    System.out.println("3. See report for an assignment.");
    System.out.println("4. See report for a student.");
    System.out.println("5. Quit.");
    int choice = in.nextInt();

    System.out.println();

        if(choice == 1)
        {
        modifyNames(in, arrStudents);
        }

        else if (choice ==2)
        {
        enterGrades(in, arrStudents, arrGrades, grades);   
        }

        else if (choice == 3)
        {
        reportGrades(in, arrStudents, arrGrades, grades, students);
        }

        else if (choice==4)
        {
        reportStud(in, arrStudents, arrGrades, grades, students);
        }

        else
        {
        System.out.println("GAME OVER MAN!");
        done = true;    
        }
    
    }
    

    
    
}
    
public static void modifyNames (Scanner in, String arrStudents[])
{
    
System.out.println("Choose a students name to change:");

            for(int i=0; i<arrStudents.length; i++)
            {
            System.out.println((i+1) + ". " + arrStudents[i]);    
            }
    
        int nameStudent = in.nextInt();    
        nameStudent = nameStudent - 1;

        System.out.println("Enter new name:");
        arrStudents[nameStudent] = in.next();

        System.out.println();       

}
        
public static void enterGrades (Scanner in, String arrStudents[], int arrGrades[][], int grades)
{


            for (int i=0; i<grades ; i++)
            {
            System.out.println("Assignment #" + (i+1));    
            }
   
        System.out.println("Which assignment would you like to enter grades for?"); 
        int choiceGrades = in.nextInt();   
        choiceGrades = choiceGrades - 1;    
  
            for (int i=0; i<arrStudents.length; i++)
            {
            System.out.println("Enter " + arrStudents[i] + "'s grade:");
            arrGrades[i][choiceGrades]=in.nextInt();    
            }
        System.out.println();   
}    
    
public static void reportGrades (Scanner in, String arrStudents[], int arrGrades[][], int grades, int students)
{
for (int i=0; i<grades ; i++)
            {
            System.out.println("Assignment #" + (i+1));    
            }
   
        System.out.println("Choose and assignment to see the report?"); 
        int choiceGrades2 = in.nextInt();
        choiceGrades2 = choiceGrades2 - 1;

            for (int i=0; i<students; i++)
            {
            System.out.println(arrStudents[i] + "'s grade: " + arrGrades[i][choiceGrades2]);
            }
   
        int mathMin = 1000000; 

            for (int i=0; i<students-1; i++)
            {
            mathMin = Math.min(arrGrades[i][choiceGrades2], mathMin);    
            }
    
        System.out.println("The minimum: " + mathMin);   
        
        int mathMax = -1000000; 
    
            for (int i=0; i<students; i++)
            {
            mathMax = Math.max(arrGrades[i][choiceGrades2], mathMax);    
            }
    
        System.out.println("The maximum: " + mathMax);   
  
        int mean = 0;  
    
            for (int i=0; i<students; i++)
            {
            mean = mean + arrGrades[i][choiceGrades2];
            }

        mean = mean/students;

        System.out.println("The mean: " + mean);
   
        System.out.println();    
}     
    
public static void reportStud (Scanner in, String arrStudents[], int arrGrades[][], int grades, int students)
{
            for (int i = 0; i<students; i++)
            {
            System.out.println((i+1) + ". " + arrStudents[i]);    
            }
   
        System.out.println("Choose a student to see their report.");
        int studChoice = in.nextInt();
        studChoice = studChoice - 1;

        int total = 0;

            for (int i=0; i<grades; i++)
            {
            System.out.println("Assignment #" + (i+1) + ": " + arrGrades[studChoice][i]);    
            total = arrGrades[studChoice][i] + total;    
            }

        double average = total/grades;

        System.out.println(arrStudents[studChoice] + "'s Current Average: " + average);

        System.out.println();
}        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}