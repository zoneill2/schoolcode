//Grabbing Scanner Class
import java.util.Scanner;

//Naming the program
public class MadLibMaker 
{

   public static void main (String [] args)
   {
   //Variables
   String noun;
   String verbing;
   String animal;
   String verb;
   String bodypart;
   
   Scanner in = new Scanner (System.in); //Calling Scanner
   
   System.out.print("Whats your favorite animal? "); //asks user for favorite animal
   animal = in.next(); //Setting next characters to "animal"
   
   System.out.print("Whats a verb that ends with -ing? "); //asks user for -ing verb
   verbing = in.next(); //sets users input as "verbing"
   
   System.out.print("Give me a noun. "); //asks user for noun
   noun = in.next(); //sets users input as "noun"
   
   System.out.print("Give me a body part. "); //asks user for body part
   in.nextLine(); //clearing eol
   bodypart = in.nextLine(); //sets users input as "body part"
   
   System.out.print("Finally, give me a verb. "); //asks user for verb
   verb = in.next(); //sets users input as "verb"
   
   //Prints out the final messages with all variables in right places
   System.out.println("Professor Weissman was showing a video about a " + animal + " " + verbing +
   " \nwhen all of a sudden a " + noun + " came out of nowhere, to avoid being hit in the face he slapped the " 
   + noun + ",\ncausing it to fly across the room and hit a student in the " + bodypart + ". The student began to " + verb + ".");
   
   
   
   
 
   }




}