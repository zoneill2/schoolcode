import java.util.Scanner;
public class PasswordChecker
{

public static void main (String [] args)
{
String password; //setting variable

Scanner in = new Scanner(System.in);

System.out.println("Welcome! Please Create a Password! It must have: \n8 Characters. \nOnly can be digits and letters. \nContain 2 digits.");
password = in.next(); //variable password will equal next input

if (passwordStandards(password)) //if return is true
{
System.out.println("This password meets requirements!");
}

else //if return is false
{
System.out.println("This password does not meet requirements!");
}


}

public static boolean passwordStandards (String password) //method of boolean type
{
if (password.length() < 8) //if password is less then 8 character check
    {   
        return false;  
    } 
    else 
    {      
        char c;  
        int count = 0;   
        for (int i = 0; i < password.length(); i++) //from 0 to the passwords length
        {  
            c = password.charAt(i); //c will equal each character in the passwords length  
            if (!Character.isLetterOrDigit(c)) //if its not a character or digit return false
            {          
                return false;  
            } 
            else if (Character.isDigit(c)) //if character is a digit
            {  
                count++; //add to count    
            }  
        }  
        
        if (count < 2) //if digits are less than 2 then return false  
        {     
            return false;  
        }  
    }  
    return true; //return true if all requirements are met 
}


}