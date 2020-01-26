//Grabbing Scanner Class
import java.util.Scanner;

//Naming the program
public class RestrauntBillComputer 
{

   public static void main (String [] args)
   {
   //Variables
   double subtotal;
   double gratuityRate;
   double gratuity;
   double total;
   double gratuityRate2;
  
   
   Scanner in = new Scanner (System.in); //Calling Scanner
   
   System.out.print("What would your subtotal be?  $"); //Asking the user their subtotal
   subtotal = in.nextDouble(); //Setting the users input as "subtotal"
   
   System.out.print("What is the tip rate you would like to leave? %"); //asking the user the percentage of their bill they will tip
   gratuityRate = in.nextDouble(); //setting users input as "gratuity rate
   gratuityRate2 = (gratuityRate / 100); //turning the percentage into a decimal
   
   gratuity = gratuityRate2 * subtotal; //calculating the gratuity
   gratuity = Math.round(gratuity * 100.0) / 100.0; //rounding

   total = gratuity + subtotal; //calculating the total
   total = Math.round(total * 100.00) / 100.00; //rounding

   
   //Displaying the tip and total
   System.out.println("Your whole total for your items, including a tip of " + "$" + gratuity + 
   " resulting in a total of " + "$" + total + "!");
   
   
   
   
   }
   
   
}