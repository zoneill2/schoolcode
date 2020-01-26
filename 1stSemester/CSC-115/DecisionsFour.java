import java.util.Scanner;

public class DecisionsFour
{

   public static void main (String [] args)
  
      {
      int csc115stud;
      int tummyStatus;
     
      Scanner in = new Scanner (System.in);
      System.out.print("Are you a CSC 115 student? [1-No 2-Yes] ");
      csc115stud = in.nextInt();
      System.out.print("Are you hungry? [1-No 2-Yes] ");
      tummyStatus = in.nextInt();
      
      if (csc115stud == 2 && tummyStatus == 2)
      {
      System.out.println("Hungry Hungry Student! ");
      }
      
      else if (csc115stud == 2 && tummyStatus == 1)
      {    
      System.out.println("No Hungry Student! ");
      }
      
      else if (tummyStatus == 2)
      {
      System.out.println("Then get out and get food!");
      }
      
      else
      {
      System.out.println("Then what the hell are you doing here?");
      }
      
      
      
      
      
      
      
      
      
      }




















}