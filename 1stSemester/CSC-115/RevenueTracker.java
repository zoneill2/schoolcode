//Zach ONeill
//12/20/18
//CSC-115
//Practical

import java.util.Scanner;
public class RevenueTracker
{

public static void main (String [] args)
{
Scanner in = new Scanner(System.in);
double total2 = 0; //setting total as 0, since no expenses have been depicted
double total = 0; //setting total as 0, since no revenues have been depicted
System.out.print("Enter the number of revenue sources you have in a month: "); //setting amount of revenues chosen to variable "revenues"
int revenues = in.nextInt();

System.out.print("Enter the number of expenses you have in a month: "); //setting amount of expenses chosen to variable "expenses"
int expenses = in.nextInt();

double[] revenueArray = new double[revenues]; //creating a double array with as many spots in it as user described above

double[] expensesArray = new double[expenses]; //creating a double array with as many spots in it as user described above

System.out.println("--------------------");

for(int i=0; i<revenueArray.length; i++) //loop goes from 0 to 1 less than revenueArray's length
{
System.out.print("Enter revenue amount " + (i+1) + ": "); //loop asking the user for the value of each revenue source
revenueArray[i] = in.nextDouble();  //setting revenue to spot in revenueArray
total = total + revenueArray[i]; //totaling revenue 

}

System.out.println("--------------------");

for(int i=0; i<expensesArray.length; i++) //loop goes from 0 to 1 less than expensesArray's length
{
System.out.print("Enter expenses amount " + (i+1) + ": "); //loop asking the user for values of each expense
expensesArray[i] = in.nextDouble();  //setting each expense to a spot in expensesArray
total2 = total2 + expensesArray[i]; //totaling expenses
}

total = Math.round(total*100.00)/100.00;

total2 = Math.round(total2*100.00)/100.00;      //rounding since money can only go into hundreths place

double balance = total-total2;      //calculating balance by subtracting total from total2

balance = Math.round(balance*100.00)/100.00;

System.out.println("Your revenues totaled " + total + " this month.");
System.out.println("Your expenses totaled " + total2 + " this month.");    //printing all information
System.out.println("Your balance at the end of the month is: " + balance);


if (balance<0)
{
System.out.println("You're in financial trouble!");
}

else if (balance<=20)
{
System.out.println("You're cutting it too close!");
}                                                           //sorting the users balance into a categorical message

else if (balance<=50)
{
System.out.println("You're in good financial shape!");
}
                                                            
else
{
System.out.println("You're in great financial shape!");
}





}
























}