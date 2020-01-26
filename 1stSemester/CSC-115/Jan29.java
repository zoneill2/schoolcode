import java.util.Scanner;
import java.util.ArrayList;
public class Jan29
{

public static void main (String[] args)
{
    
Scanner in = new Scanner(System.in);    
//ArrayList list = new ArrayList();    
//int [] list2 = new int[10];

ArrayList<String> list= new ArrayList<String>();

System.out.println("Here are the current movies!");

list.add("Avengers: End Game");
list.add("Captain Marvel");
list.add("Episode IX");
list.add(1,"Lego Movie 2");
    
    
System.out.println(list);    
//System.out.println(list.contains("Captain Marvel"));
    
System.out.println("Are you returning or picking up a movie? 1-Pickup. 2-Dropoff");
int choice = in.nextInt();

if (choice == 1)
{
    
System.out.println("What movie do you want to get?");
String movie = in.nextLine();

int pos = list.indexOf(movie);
if (pos >= 0 && pos <= list.size())
{
 
 list.remove(pos);   
System.out.println(list);
}

else
{

System.out.println("Sorry Jimbo"); 
    
}   

}

else if (choice == 2)
{

System.out.println("What movie are you dropping off?");
String movie2 = in.nextLine();
list.add(movie2);
    
    
}

else
{

System.out.println("Sorry Jimbo");  
    
}
    
    
System.out.println(list); 
    
//list.get(0);

//System.out.println(list);

//list.remove(0);

//System.out.println(list);

//list.remove(list.indexOf("Captain Marvel"));

//System.out.println(list);

/*
System.out.println("What movie do you want to get?");
String movie = in.nextLine();

int pos = list.indexOf(movie);
if (pos >= 0 && pos <= list.size())
{
 
 list.remove(pos);   
System.out.println(list);
}

else
{

System.out.println("Sorry Jimbo"); 
    
}

*/
//list.clear();

//System.out.println(list);
    
    
    
    
    
}























}