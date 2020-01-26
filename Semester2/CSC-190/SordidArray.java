import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class SordidArray
{
    
   public static void main (String [] args)  
   {

    Scanner in = new Scanner(System.in);

    boolean done = false;
    ArrayList<String> list= new ArrayList<String>();
    
    String sentinal="~*QUIT*~";

    while (!done)
    {

    System.out.println("Enter a word:");
    String words = in.nextLine();

        if (words.equals(sentinal))
        {
    
        done = true;    
        System.out.println("The sorted array looks like this:");
        System.out.println(list);
        }   

        else
        {

        list.add(words);
        Collections.sort(list);
        System.out.println(list);
        }


    

    
    
    
    }
    
    System.out.println();
    System.out.println();
    System.out.println("GAME OVER MAN!");
    
  }

}