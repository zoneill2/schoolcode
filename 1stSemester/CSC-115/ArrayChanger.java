import java.util.Scanner;
public class ArrayChanger
{

public static void main (String [] args)
{
Scanner in = new Scanner(System.in);

System.out.print("How many elements do you want in your array? ");
int elements = in.nextInt();

int[] array = new int[elements];

for (int i=0; i<array.length; i++)
{
System.out.print("Give me a number for position " + (i+1) + "! ");
array[i] = in.nextInt();

}
System.out.println();
System.out.println("Your Array!");
System.out.println();

for (int i=0; i<array.length; i++)
{
System.out.println("Position " + (i+1) + ": " + array[i]);
}

int lastvalplace = array.length-1;
int firstval = array[0];
array[0] = array[lastvalplace];
array[lastvalplace] = firstval;

System.out.println();
System.out.println("Your Array Swapped!");
System.out.println();


for (int i=0; i<array.length; i++)
{
System.out.println("Position " + (i+1) + ": " + array[i]);
}

int temp2 = array[array.length-1];

 for (int i = array.length-2 ; i>=0 ; i-- )
   {
   array[i+1] = array[i];
   }  
   array[0] = temp2;
   
System.out.println();
System.out.println("Your Array Shifted Down!");
System.out.println();

for (int i=0; i<array.length; i++)
{
System.out.println("Position " + (i+1) + ": " + array[i]);
}


for (int i=0; i<array.length; i++)
{
if(array[i]%2==0)
{
for (int j=0; j<array.length; j++)
{
array[i]=52;
}

}
}

System.out.println();
System.out.println("Your Array With Evens Replaced!");
System.out.println();
for (int i=0; i<array.length; i++)
{
System.out.println("Position " + (i+1) + ": " + array[i]);
}

for (int i=0; i<array.length; i++)
{
if(array[i]%2!=0)
{
for (int j=0; j<array.length; j++)
{
array[i]=i*2;
}

}
}

System.out.println();
System.out.println("Your Array With Odds Replaced!");
System.out.println();
for (int i=0; i<array.length; i++)
{
if(array[i]%2!=0)
{
array[i]=i*2;
}
}

for (int i=0; i<array.length; i++)
{
System.out.println("Position " + (i+1) + ": " + array[i]);
}









}












}