import java.util.*;

public class ArrayCopier {
   public static void main (String[] arg) {
   
   int n = 1234;
   //System.out.println(sum2(n));
   //System.out.println(sum3(n));
   outputNum(n);
   System.out.println();
   outputNum2(n);
   
 
   
   }
   
   
   public static int sum2(int n) {
      if(n==1) {
         return 1;
      }
      return n+sum2(n-1);
   
   }
   
    public static int sum3(int n) {
      if(n==1) {
         return 1;
      }
      return n*sum3(n-1);
   
   }
   
    public static void outputNum(int n) {
       
      if(n==0) {
         return;
      }
      System.out.println(n%10);
      outputNum(n/10);
   
   }
   
   public static void outputNum2(int n) {
       
      if(n==0) {
         return;
      }
      
      outputNum2(n/10);
      System.out.println(n%10);
   
   }
   
   
   
   
   

}