import java.util.Scanner;
public class BikeTripCalculator 
{

public static void main (String [] args)
{
Scanner in = new Scanner(System.in);
int total = 0; //setting total as 0, since no miles have been depicted
System.out.print("How many days would you like to go on a bike trip for? "); //setting amount of days chosen to variable "days"
int days = in.nextInt();

for(int i=0; i<days; i++) //loop goes from 0 to 1 less than whatever number of days was given already
{
System.out.print("How many miles on day " + (i+1) + "? "); //loop asking the user how many miles for each of the days they chose
int miles = in.nextInt();  //setting miles chosen as variable "miles"
while(miles<0) //while loop that forces the user to put a number greater than 0
{
System.out.println("Cant bike negative miles! Try again!");
System.out.print("How many miles on day " + (i+1) + "? ");
miles = in.nextInt();
}
total = total + miles; //totaling miles chosen
}

if (total<10)
{
System.out.println("Very relaxing bike trip!");
}

else if (total>=10 && total<50)
{
System.out.println("Relaxing bike trip!");
}

else if (total>=50 && total<80)
{
System.out.println("Good bike trip!");
}
                                                   //sorting the users total number of miles into a categorical message
else if (total>=80 && total<150)
{
System.out.println("Tiring bike trip!");
}

else if (total>=150 && total<275)
{
System.out.println("Professional bike trip!");
}

else
{
System.out.println("Insane bike trip!");
}





}
























}