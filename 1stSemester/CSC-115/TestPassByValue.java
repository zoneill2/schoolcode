public class TestPassByValue
{
   /*main method*/ 
   public static void main(String[] args)
   {
   //declare variables
   int num1 = 1;
   int num2 = 2;
   
   System.out.println("Before invoking the swap method, num1 is " + num1 + " num2 is " + num2);
   
   //invoke the swap method
   swap(num1,num2);
   
   System.out.println("After invoking the swap method, num1 is " + num1 + " num2 is " + num2);
   
   
   
   
   }
   
   /* swap variables */
   public static void swap(int n1, int n2)
   {
   System.out.println("\tInside the swap method");
   System.out.println("\t\tBefore swapping , n1 is " + n1 + " and n2 is " + n2);
   
   //swap n1 with n2 
   int temp = n1;
   n1 = n2;
   n2 = temp;
   
   System.out.println("\t\tAfter swapping , n1 is " + n1 + " and n2 is " + n2);
   
   
   
   
   
   
   
   }















































}