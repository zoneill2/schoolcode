 import java.util.*;

public class sep17 {
   public static void main (String[] arg) {
   
   Integer intArr[] = {3, 2 ,6};
   Double doubleArr[] = {3.2, 4.3, 5.4};
   String stringArr[] = {"hi", "jim", "jose"};
 
   //System.out.println(lastOne(intArr));
   
   System.out.println(lastOne(intArr));
   
   System.out.println(lastOne(doubleArr));
   
   System.out.println(lastOne(stringArr));
   
   
   ////////////////////////////////////////////////

   }
   
   
   public static int lastInt(int[] intArr) {
      return intArr[intArr.length-1];
   }
    public static <E> E lastOne(E[] list) {
      return list[list.length-1];
   }
     public static double lastDoub(double[] doubleArr) {
      return doubleArr[doubleArr.length-1];
   }
     public static String lastString(String[] stringArr) {
      return stringArr[stringArr.length-1];
   }
   
   
  
}