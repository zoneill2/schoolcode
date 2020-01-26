import java.util.Scanner;
public class Boxes 
{
    
public static void main (String [] args)
{
    
Scanner in = new Scanner(System.in);
    
System.out.println("Enter a phrase: ");
String sentence = in.nextLine();

System.out.println();

System.out.println("Enter a character: ");
char character = in.next().charAt(0);

System.out.println();
    
boxString(sentence, character);

System.out.println();

System.out.println("GAME OVER MAN!");

  
}   


public static void boxString(String sentence, char character)
{
   
    
int n = sentence.length();  

    if (n<30)
    {
        for (int i=0; i < n+4; i++)
        {
        System.out.print(character);    
        }    

    }


    else
    {
        for (int i=0; i < 34; i++)
        {
        System.out.print(character);    
        }    
  
    
    
    }
    
System.out.println();

  
    if (sentence.length()>30)
    {
    int lastChars = sentence.length() % 30;
    int fullLines = (sentence.length()-lastChars)/30; 

    String newLine = "";
        for (int i=0; i<fullLines; i++)
        {
        newLine = sentence.substring(0, 30);
        sentence = sentence.substring(30);
        System.out.print(character + " " + newLine+ " " + character + "\n");
        }

    int spacesNeeded = 30 - lastChars;
    String space = " "; 

        for (int i=0; i<spacesNeeded; i++)
        {
        space = space + " ";
        } 
        
    System.out.println(character + " " + sentence.substring(0, lastChars) + space + character);
    
    }


    else
    {
    
    System.out.println(character + " " + sentence + " " + character); 
    }


    if (n<30)
    {
        for (int i=0; i < n+4; i++)
        {
        System.out.print(character);    
        }       

    }


    else
    {
        for (int i=0; i < 34; i++)
        {
        System.out.print(character);    
        }    

    }


System.out.println();

}
    

}