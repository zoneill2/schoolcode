import java.util.Scanner;
import java.util.Random;

public class HighLowGame

{
   public static void main (String [] args)
   {
   int magicNumber;
   int guess;         //Variables
   int guessNum = 0;
   
    
   Scanner in = new Scanner (System.in);
   boolean done = false;
   Random myRand = new Random ();
   magicNumber = 1 + myRand.nextInt(100); //Adding one to random number so it is 1-100
   //System.out.println(magicNumber);
   System.out.println("Welcome to the Higher/Lower game!");
   System.out.print("Guess a number 1-100 ");
   guess = in.nextInt();      //setting users input from question to variable
   
   
   while (!done )
   {
  
      if (guess != magicNumber ) //if guess doesnt match number
      {
         if (guess > magicNumber && guess > 0 && guess < 100) //if guess is greater than magicnumber
         {
         System.out.println("Lower!");
         System.out.print("Guess a number 1-100 ");      
         guessNum = guessNum + 1; //adds 1 guess to the total guesses
         guess = in.nextInt(); //setting users input from question to variable
         }
         
         else if (guess < magicNumber && guess > 0 && guess < 100) //if guess is less than magicnumber
         {
         System.out.println("Higher!");
         System.out.print("Guess a number 1-100 ");
         guessNum = guessNum + 1; //adds one to the total guesses
         guess = in.nextInt(); //setting users input from question to variable
         } 
         
         else if (guess < 0)
         {
         System.out.println("Error: Number must be in the described range!");
         System.out.print("Guess a number 1-100 ");   
         guess = in.nextInt(); //setting users input from question to variable
         }
         
          else if (guess > 100)
         {
         System.out.println("Error: Number must be in the described range!");
         System.out.print("Guess a number 1-100 ");   
         guess = in.nextInt(); //setting users input from question to variable
         }
         
         else
         {
         System.out.println("Error: Must actually be a number!");
         System.out.print("Guess a number 1-100 ");   
         guess = in.nextInt(); //setting users input from question to variable
         }
       
         
      }
      
      else 
      {
      System.out.println("Winner Winner!!");
      done = true;
      }
      
  
   
   }
   
   System.out.println("It took you " + guessNum + " guesses!");


















   }








}



















