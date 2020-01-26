import java.util.Scanner;
public class BowlingScoreMeasurer
{

public static void main (String [] args)
{
Scanner in = new Scanner(System.in);
int total = 0; //setting total as 0, since no miles have been depicted
System.out.print("How games of bowling did you play? "); //setting amount of days chosen to variable "days"
int rounds = in.nextInt();

for(int i=0; i<rounds; i++) //loop goes from 0 to 1 less than whatever number of days was given already
{
System.out.print("What was your score on round " + (i+1) + "? "); //loop asking the user how many miles for each of the days they chose
int score = in.nextInt();  //setting miles chosen as variable "miles"
while(score<0) //while loop that forces the user to put a number greater than 0
{
System.out.println("Cant score negative! Try again!");
System.out.print("What was your score on round " + (i+1) + "? ");
score = in.nextInt();
}
total = total + score; //totaling miles chosen
}

double average = total/score;
System.out.println(average + " was your average score!");

if (average<100)
{
System.out.println("Try another sport!");
}

else if (average>=100 && average<120)
{
System.out.println("Not bad!");
}

else if (average>=120 && average<150)
{
System.out.println("Good Job!");
}
                                                   //sorting the users total number of miles into a categorical message

else
{
System.out.println("Wow go on tour!");
}





}
























}