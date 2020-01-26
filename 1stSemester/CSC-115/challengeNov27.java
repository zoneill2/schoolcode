import java.util.Random;
import java.util.Scanner;
public class challengeNov27
{

public static void main (String [] args)
{
int total2= 0;
int total = 0;
Random rand = new Random();
Scanner in = new Scanner(System.in);
System.out.print("How long do you want your array to be? ");
int howLong = in.nextInt();


int[] myNumbas = new int[howLong];
int large2 = myNumbas[0];

for (int i = 0; i < myNumbas.length; i++)
{
System.out.print("Give me a number for position " + (i+1) + "! ");
myNumbas[i] = in.nextInt();
total = total + myNumbas[i];
if (myNumbas[i]>large2)
{
large2 = myNumbas[i];
}
}


for (int i = 0; i < myNumbas.length; i++)
{
System.out.println("Position " + (i+1) + ": " + myNumbas[i]);

}


System.out.println("The largest of the random numbers was " + large2 + "!");
System.out.println("The total of the values you entered is... " + total + "!");
System.out.println();
System.out.println("Your numbers sucked, I like these ones!");
int large = myNumbas[0];

for (int i = 0; i < myNumbas.length; i++)
{
myNumbas[i] = 1+rand.nextInt(100);
System.out.println("Position " + (i+1) + ": " + myNumbas[i]);
total2 = total2 + myNumbas[i];
if (myNumbas[i]>large)
{
large = myNumbas[i];
}

}

System.out.println("The largest of the random numbers was " + large + "!");



//System.out.println("The largest number of these random numbers was " + 
System.out.println("The total of the values randomly generated is... " + total2 + "!");



}

















}