import java.util.*;

public class test {
   public static void main (String[] arg) {
   
ArrayList<Integer> list=new ArrayList<Integer>();    
   
   list.add(0);
   list.add(16);
   list.add(9);
   list.add(1);
   list.add(64);
   list.add(25);
   list.add(25);
   list.add(14);
   list.add(0);
   
 

    for (int i = 1; i < list.size(); i += 2) {
        if (list.get(i - 1) >= list.get(i)) {
            list.remove(i);
            list.add(0, 0);
        }
    System.out.println(list);
   
   }
   ////////////////////////////////////////////////

   
   
   
   }
   
   }