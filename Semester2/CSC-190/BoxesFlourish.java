//Zach ONeill

import java.util.Scanner;
public class BoxesFlourish 
{
    
public static void main (String [] args)
{
    
Scanner in = new Scanner(System.in);
    
System.out.println("Enter a sentence: ");
String sentence = in.nextLine();
    
    
boxString(sentence);
  
}   


public static void boxString(String sentence)
{

System.out.println();
    
int n = sentence.length(); 
String fatSpace = " ";

    if (n<30)
    {

        for (int i=0; i < n+4; i++)
        {
        fatSpace = fatSpace + " ";
        }  

        }


    else
    {

        for (int i=0; i < 34; i++)
        {
        fatSpace = fatSpace + " ";
        }    

    }


    if (n<30)
    {
    System.out.println("(" + fatSpace + ".-.");
    System.out.print("(");
        for (int i=0; i < n+4; i++)
        {
        System.out.print("_");    
        }    
    System.out.print("()6 '-.");

    }


    else
    {
    System.out.println("(" + fatSpace + ".-.");
    System.out.print("(");
        for (int i=0; i < 34; i++)
        {
        System.out.print("_");    
        }    
    System.out.print("()6 '-.");
  
    
    
    }
    System.out.println();


    
    if (sentence.length()>30)
    {
    int lastChars = sentence.length() % 30;
    int fullLines = (sentence.length()-lastChars)/30; 


    int chin = 0;
    String newLine = "";
        for (int i=0; i<fullLines; i++)
        {
        chin=chin + 1;
        newLine = sentence.substring(0, 30);
        sentence = sentence.substring(30);

    
            if(chin==1)
            {
            System.out.print("("+ " " + newLine+ " " + " /  ''\"`" + "\n");
            }
            
            else
            {
            System.out.print("("+ " " + newLine+ " " + " /" + "\n");
            }
            
        }


    int spacesNeeded = 30 - lastChars;
    int spacesWanted = spacesNeeded/2;
    String space = " "; 

        for (int i=0; i<spacesWanted; i++)
        {
        space = space + " ";
        } 
 
    System.out.println("(" + space + sentence.substring(0, lastChars) + space + " /");
    
    }


    else
    {
    System.out.println("(" + " " + sentence + "  " + "/  ''\"`");   
    }

String legSpace = " ";

    for (int i=1; i<n-4; i++)
    {
    legSpace = legSpace + " ";   
    }

String spaceLeg = " ";

    for (int i=1; i<27; i++)
    {
    spaceLeg = spaceLeg + " ";   
    }



    if (n<30)
    {
    System.out.print("( ");
        for (int i=0; i < n; i++)
        {
        System.out.print("_");    
        }    

    System.out.print(" /");
    
    System.out.println("\n " + "//\\" + legSpace + "//\\");
    System.out.println(" m  m" + legSpace + "m m"); 
    }
    

    else
    {
    System.out.print("(");
        for (int i=0; i < 32; i++)
        {
        System.out.print("_");    
        }    

    System.out.print(" /");

    System.out.println("\n " + "//\\" + spaceLeg + "//\\");    
    System.out.println(" m  m" + spaceLeg + "m m");      
    }


System.out.println();
}
    
    
    
    
    
}