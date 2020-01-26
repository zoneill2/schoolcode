import java.math.BigDecimal;
import java.util.Scanner;
public class challenge1
{

public static int multiply(int num, int num2)
{

System.out.println(num*2);

return num;

}

public static double multiply(int num)
{

System.out.println(num*45);

return num;

}

public static double multiply(int num, int num2,int num3)
{
System.out.println(num*num2*num3);

return num;

}






public static void main (String [] args)
{
Scanner in = new Scanner (System.in);
System.out.print("Give me a number... ");
int numba = in.nextInt();
System.out.print("Give me another number... ");
int numba2 = in.nextInt();
System.out.print("Give me another number... ");
int numba3 = in.nextInt();

multiply(numba,numba2);
multiply(numba2);
multiply(numba,numba2,numba3);





}

















}