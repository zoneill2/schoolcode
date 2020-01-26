//Zach ONeill

import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
    public static void main (String[] args) {

        // Welcome the user
        System.out.println("Welcome to the Bank-O-Matic 2000");

        // Create an ArrayList to hold the accounts
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

        // Create a Scanner object
        Scanner in = new Scanner(System.in);

        // Create a variable to manage the choice of the user.
        int choice;

        // WHILE LOOP to iterate until the user chooses "9. Quit" (which will invoke 'return')
        while (true) {

            // Display the menu and load 'choice' with input from user
            displayMenu();
            System.out.print("Your choice: ");
            choice = in.nextInt(); // Don't worry about erroneous data
            System.out.println();

            // Handle the 'choice' with a switch statement
            // Call methods (passing in the ArrayList 'accounts')
            switch (choice) {
                case 1: addAccount(accounts, in);
                    break;
                case 2: checkStatus(accounts, in);
                    break;
                case 3: changeAccountHolderName(accounts, in);
                    break;
                case 4: deposit(accounts, in);
                    break;
                case 5: withdraw(accounts, in);
                    break;
                case 6: getInterestRate();
                    break;
                case 7: setInterestRate(in);
                    break;
                case 8: applyInterest(accounts);
                    break;
                case 9: System.out.println("Thank you for using Bank-O-Matic.");
                    return;
                default:
                    System.out.println("Not a valid number.");
                    break;
            }
        }
    }

    // Displays the menu
    public static void displayMenu() {
        System.out.println("\n\nPlease select from the following menu:");
        System.out.println("\t1. Add an account");
        System.out.println("\t2. Check status of an account");
        System.out.println("\t3. Change the name of an account holder");
        System.out.println("\t4. Deposit money in an account");
        System.out.println("\t5. Withdraw money from an account");
        System.out.println("\t6. Get the interest rate");
        System.out.println("\t7. Set the interest rate");
        System.out.println("\t8. Apply interest to every account");
        System.out.println("\t9. Quit");
    }

    //adds an account based on information user enters
    public static void addAccount(ArrayList<BankAccount> accounts, Scanner in)
    {
       in.nextLine();
       System.out.println("Lets Create an Account!");
       System.out.println("Name under the account: ");
       String name = in.nextLine();
       
       System.out.println("Account Balance: ");
       double bal = in.nextDouble();
       
       accounts.add(new BankAccount(bal, name));
      
      
    }

    //method checks funds, name, and account number based on account chosen
    public static void checkStatus(ArrayList<BankAccount> accounts, Scanner in)
    {
            for (int i=0; i<accounts.size(); i++)
            {
                System.out.println((i+1) + "." + " #" + accounts.get(i).getAccountNumber()); 
            }
        
        System.out.println("Which account do you want status of?");
        int accChoice = in.nextInt();
        accChoice = accChoice - 1;
        
        System.out.println("Name: " + accounts.get(accChoice).getName());
        System.out.println("Balance: $" + accounts.get(accChoice).getBalance());
        System.out.println("Account Number: " + accounts.get(accChoice).getAccountNumber());
          
        
    }

    //Method allows user to change name of an account holder
    public static void changeAccountHolderName(ArrayList<BankAccount> accounts, Scanner in) 
    {
            for (int i=0; i<accounts.size(); i++)
            {
                System.out.println((i+1) + "." + " #" + accounts.get(i).getAccountNumber()); 
            }
        
        System.out.println("Which account do you need to edit?");
        int accChoice = in.nextInt();
        accChoice = accChoice - 1;
      
        System.out.println("Current Name: " + accounts.get(accChoice).getName());
        
        in.nextLine();
        
        System.out.println("Insert Name: ");
        String name = in.nextLine();
        accounts.get(accChoice).setName(name);
        
        System.out.println("New Name: " + accounts.get(accChoice).getName());
         
        
    }

    // Method allows user to add funds to an account chosen
    public static void deposit(ArrayList<BankAccount> accounts, Scanner in)
    {
      
            for (int i=0; i<accounts.size(); i++)
            {
                System.out.println((i+1) + "." + " #" + accounts.get(i).getAccountNumber()); 
            }  
        
        System.out.println("Which account do you need to deposit in?");
        int accChoice = in.nextInt();
        accChoice = accChoice - 1;
        
        System.out.println("Current Balance: $" + accounts.get(accChoice).getBalance());
        
        System.out.println("How much do you wish to deposit?");
        double amount = in.nextDouble();
        
        accounts.get(accChoice).deposit(amount);
        
        
    }

    //method allows user to remove funds to account chosen
    public static void withdraw(ArrayList<BankAccount> accounts, Scanner in)
    {
            for (int i=0; i<accounts.size(); i++)
            {
                System.out.println((i+1) + "." + " #" + accounts.get(i).getAccountNumber()); 
            }  
        
        System.out.println("Which account do you need to withdraw from?");
        int accChoice = in.nextInt();
        accChoice = accChoice - 1;
        
        System.out.println("Current Balance: $" + accounts.get(accChoice).getBalance());
        
        System.out.println("How much do you wish to withdraw?");
        double amount = in.nextDouble();
        
        accounts.get(accChoice).withdraw(amount);

    }
    
    
    // Display the interest rate
    public static void getInterestRate()
    {
        System.out.println("Current Interest Rate: " + BankAccount.getInterestRate());
    
    }

    // Set the interest rate
    public static void setInterestRate(Scanner in)
    {
        System.out.println("Current Interest Rate: " + BankAccount.getInterestRate());
        
        System.out.println("What is the new interest rate? As decimal.");
        double rate = in.nextDouble();
        
        BankAccount.setInterestRate(rate);
        System.out.println("New Interest Rate: " + BankAccount.getInterestRate());
    }

    //loop runs through every account and applies interest, as well as displays funds before and after
    public static void applyInterest(ArrayList<BankAccount> accounts) 
    {
    
        for (int i = 0; i < accounts.size(); i++)
        {   
            System.out.println("Account: " + accounts.get(i).getAccountNumber());
            System.out.println("Balance before: $" + accounts.get(i).getBalance());
            accounts.get(i).accrueInterest();  
            System.out.println("Balance after: $" + accounts.get(i).getBalance()); 
            System.out.println();
        }

    }
}