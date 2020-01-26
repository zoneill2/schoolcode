import java.util.Scanner;


public class MyFirstMethod
{

   public static int adder(int start, int stop)
   {
   
   int sum=0;
   
 
   
   for (int i=start; i<=stop; i++)
     {
  
     sum = sum + i;    
   
   
     }

    return sum;

    
   } 
   
   public static int multiplier(int start, int stop)
   {
   
   int sum=1;
   
 
   
   for (int i=start; i<=stop; i++)
     {
  
     sum = sum*i;    
   
   
     }

    return sum;

    
   } 

   
   



      public static void main (String [] args)

      {
      int start;
      int stop;
      String answer;
      int answer2;
      int answer3;
      boolean done=false;
      
      while(!done)
      {
      System.out.println("Do you want to play? 0-Yes 1-No");
      answer2 = in.next();
      
      
      if (answer2.equalsIgnoreCase("Y"))
      {
      System.out.println("Add or Multiply?");
      
      }
      else
      {
      System.out.println("Goodbye");
      }
      
      
   
      
      
      Scanner in = new Scanner(System.in);
     
      System.out.println("What is your starting number?");
      start = in.nextInt();
      System.out.println("What is your ending number?");
      stop = in.nextInt();
      
      
     
      
     
      
      System.out.println("Sum of numbers from " + start + "-" + stop + " is " + adder(start,stop));
    
      
      
      System.out.println("Again? Y/N");
      answer = in.next();
      
      if (answer.equalsIgnoreCase("Y"))
      {
      System.out.println("What is your starting number?");
      start = in.nextInt();
      System.out.println("What is your ending number?");
      stop = in.nextInt();
      }
      else 
      {
      System.out.println("Goodbye!");
      done = true;
      
      }
      
      System.out.println("Sum of numbers from " + start + "-" + stop + " is " + adder(start,stop));
      
   
    
     
      
      }
      
      
      
      
      
      
      
      
      
      
      }
      
      























}