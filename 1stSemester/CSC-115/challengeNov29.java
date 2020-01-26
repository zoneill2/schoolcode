import java.util.Random;
import java.util.Scanner;
public class challengeNov29
{

public static void main (String [] args)
{

double[] numbas = new double [10];




for (int i=0; i<10; i++)
{

numbas[i]= (i+1);

}

for (int i=0; i<10; i++)
{
//numbas [i] = 10*Math.random()+1;

System.out.println("Position " + (i+1) + ": " + numbas [i]);

}

System.out.println();

double temp = numbas[numbas.length-1];


for (int i = 1; i<numbas.length-i;i++)
{
numbas[i-1] = numbas[i];

}
numbas[0] = temp;



/*
for (int j = numbas.length +1; j<0 ;j++)
{

int i = (int) (Math.random() * (j+1));
double temp = numbas[j];
numbas[j] = numbas[i];
numbas[i]= temp;

}
*/





for (int i=0; i<10; i++)
{
//numbas [i] = 10*Math.random()+1;

System.out.println("Position " + (i+1) + ": " + numbas [i]);

}



}

















}