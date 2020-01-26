public class ArrayCopierChallange

{
public static void main (String [] args)
{

int[] sourceArray = {1, 2, 3, 4, 5};
int[] targetArray = new int[sourceArray.length*2];
for (int i = 0; i < sourceArray.length; i++) 
{
targetArray[i] = sourceArray[i];
}


System.out.println("Source Array:");

  for (int i=0;i<sourceArray.length;i++)
  {
  System.out.println("Position " + (i+1)+ ": " + sourceArray[i]);
  }
  System.out.println();

System.out.println("Target Array:");

  for (int i=0;i<targetArray.length;i++)
  {
  System.out.println("Position " + (i+1)+ ": " + targetArray[i]);
  }
  System.out.println();


}

}