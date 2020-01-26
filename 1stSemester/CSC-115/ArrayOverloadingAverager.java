//Zach O'Neill 
//CSC-115
//Assignment #12
//12/13/18
//

import java.util.Scanner;
public class ArrayOverloadingAverager
{

public static int average(int [] array)
{
int total = 0;                            //method that takes the average of int array

for (int i=0; i<array.length; i++)
{
total= array[i]+ total;

}

int average = total / array.length;

System.out.println(average);        //taking the average by dividing total by arrays length


return average;

}


public static double average(double [] array)
{
double total = 0;                         //method that takes the average of the double array

for (int i=0; i<array.length; i++)     
{
total= array[i]+ total;

}

double average = total / array.length; //taking the average by dividing total by arrays length

System.out.println(average);


return average;

}




public static void main (String [] args)
{

Scanner in = new Scanner(System.in);

System.out.print("How many elements do you want in your double array? ");
int elements = in.nextInt();  //setting the number chosen as variable "elements"


double[] array = new double[elements]; //creating double array that is long as user chose in variable "elements"

for (int i=0; i<array.length; i++)
{
System.out.print("Give me a number for position " + (i+1) + "! ");   //asking user to assign each position to a value in the array
array[i] = in.nextDouble();

}

System.out.print("How many elements do you want in your int array? ");
elements = in.nextInt(); //setting the number chosen as variable "elements"

int[] array2 = new int[elements]; //creating int array that is long as user chose in variable "elements"

for (int i=0; i<array2.length; i++)
{
System.out.print("Give me a number for position " + (i+1) + "! "); //asking user to assign each position to a value in the array
array2[i] = in.nextInt();

}



System.out.print("Your average for double array!: ");
average(array); //calling out method "array"
System.out.print("Your average for int array!: ");
average(array2); //calling out method "array"









}









}