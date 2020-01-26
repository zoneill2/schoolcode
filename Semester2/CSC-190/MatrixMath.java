import java.util.Scanner;
public class MatrixMath
{
    
    
public static void main (String [] args)
{
    
int[][] matrix1 = new int [2][2];

int[][]matrix2 = new int [2][2];

Scanner in = new Scanner (System.in);
  
System.out.println("Time to load the first matrix!"); 
   
    for (int i=0; i<2; i++)   
    {

    System.out.println("Enter number " + (i+1) + ":");
    matrix1[i][i]=in.nextInt();    
    
    }

    for (int i=0; i<1; i++)   
    {

    System.out.println("Enter number " + (i+3) + ":");
    matrix1[i][i+1]=in.nextInt();    

    }
   
    for (int i=0; i<1; i++)   
    {

    System.out.println("Enter number " + (i+4) + ":");
    matrix1[i+1][i]=in.nextInt();    
    
    }
    
System.out.println();
      
System.out.println("==    ==");
System.out.print("|" + matrix1[0][0] + " ");
System.out.print(matrix1[1][1] + "|\n");  

System.out.print("|" + matrix1[0][1] + " ");
System.out.print(matrix1[1][0] + "|\n");  
System.out.println("==    ==");

System.out.println();

System.out.println("\nTime to load the second matrix!");  
   
    for (int i=0; i<2; i++)   
    {

    System.out.println("Enter number " + (i+1) + ":");
    matrix2[i][i]=in.nextInt();    
    
    }

    for (int i=0; i<1; i++)   
    {

    System.out.println("Enter number " + (i+3) + ":");
    matrix2[i][i+1]=in.nextInt();    

    }
   
    for (int i=0; i<1; i++)   
    {

    System.out.println("Enter number " + (i+4) + ":");
    matrix2[i+1][i]=in.nextInt();    
    
    }
    
System.out.println();
System.out.println("==    ==");
System.out.print("|" + matrix2[0][0] + " ");
System.out.print(matrix2[1][1] + "|\n");  

System.out.print("|" + matrix2[0][1] + " ");
System.out.print(matrix2[1][0] + "|\n");  
System.out.println("==    ==");
System.out.println();

int space1MatrixAdd = matrix1[0][0] + matrix2[0][0];
int space2MatrixAdd = matrix1[1][1] + matrix2[1][1];
int space3MatrixAdd = matrix1[0][1] + matrix2[0][1]; 
int space4MatrixAdd = matrix1[1][0] + matrix2[1][0];
    
System.out.println("Matrix A added to Matrix B is:\n");    

System.out.println("==    =="); 
System.out.print("|" + space1MatrixAdd + " ");
System.out.print(space2MatrixAdd + "|\n");  

System.out.print("|" + space3MatrixAdd + " ");
System.out.print(space4MatrixAdd + "|\n");
System.out.println("==    ==");

System.out.println();
    
int space1MatrixSub = matrix1[0][0] - matrix2[0][0];
int space2MatrixSub = matrix1[1][1] - matrix2[1][1];
int space3MatrixSub = matrix1[0][1] - matrix2[0][1]; 
int space4MatrixSub = matrix1[1][0] - matrix2[1][0];
    
System.out.println("Matrix B subtracted from Matrix A is:\n");    

System.out.println("==    =="); 
System.out.print("|" + space1MatrixSub + " ");
System.out.print(space2MatrixSub + "|\n");  

System.out.print("|" + space3MatrixSub + " ");
System.out.print(space4MatrixSub + "|\n");  
System.out.println("==    ==");

System.out.println();
        
System.out.println("GAME OVER MAN!");

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}