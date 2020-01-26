import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class DnD 
{
    
    public static boolean DEBUG = false;
    public static String VERSION = "D0.2";
    
    public static void main (String[] args)
    {
        
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //arraylist set for players and monsters
        ArrayList<Character> players = new ArrayList<Character>();
        ArrayList<Character> monsters = new ArrayList<Character>();
        
        System.out.println("Choose your class!");
    
        createCharacter(scanner, players);
        Character c1 = players.get(0);  //setting character made as c1
        
        System.out.println("\nTime to create a second character!");
        
        createCyclops(scanner, monsters);  //setting monster as c2
        Character c2 = monsters.get(0);
        
            for(int i=0; i<players.size(); i++)
            {
                System.out.println("Player" + (i+1) + ":");
                System.out.println("NAME:\t\t" + players.get(i).getName()); 
                System.out.println("HP:\t\t\t" + players.get(i).getHp());
                System.out.println("ARMOR:\t\t" + players.get(i).getArmor());
                System.out.println("STRENGTH:\t" + players.get(i).getStrength()); 
            }                                               //showing stats of all beings
            
            for(int i=0; i<monsters.size(); i++)
            {
                System.out.println("Monster" + (i+1) + ":");
                System.out.println("NAME:\t\t" + monsters.get(i).getName()); 
                System.out.println("HP:\t\t\t" + monsters.get(i).getHp());
                System.out.println("ARMOR:\t\t" + monsters.get(i).getArmor());
                System.out.println("STRENGTH:\t" + monsters.get(i).getStrength()); 
            }
        
        
        System.out.println("\nPress ENTER to battle.");
        scanner.nextLine();
        scanner.nextLine();
    
        
       boolean done = false;
       
       while(!done)
       {
           
        //character fighting stage
        System.out.println(c1.getName() + " Attacks!");
        c1.attack(c2);
        System.out.println(c2.getName() + " HP: " + c2.getHp());
        System.out.println(c2.getName() + " Attacks!");
        System.out.println(c1.getName() + " HP: " + c1.getHp());
        c2.attack(c1); 
        System.out.println("End Turn");
        
        
            //determines who wins and stops loop
            
            if (c1.getHp() < 0)
            {
                System.out.println(c2.getName() + " Wins!");
                done = true;
             }
        
            else if (c2.getHp() < 0)
            {
                System.out.println(c1.getName() + " Wins!");
                done = true;
            }
        
            else 
            {
                System.out.println();
            }
        
        System.out.println("Press Enter to Continue: ");
        
        scanner.nextLine();
    

       }









        // c2.attack(c1);
        
        
    }
    
    //method creates a character based on class stats
    public static void createCharacter(Scanner scanner, ArrayList<Character> players) 
    {
    
    
        
        System.out.println("Enter the name of your hero!");
        String name = scanner.nextLine();
        
        System.out.println("\n1. Swordsman:");
        System.out.println("HP: 100");
        System.out.println("Armor: 15");
        System.out.println("Strength: 10");
        
        System.out.println("\n2. Archer:");
        System.out.println("HP: 100");
        System.out.println("Armor: 8");
        System.out.println("Strength: 15");
        
        System.out.println("\n3. Mage:");
        System.out.println("HP: 125");
        System.out.println("Armor: 10");
        System.out.println("Strength: 10");
        
        
        
        System.out.println("Choose a class! ");
        int hero = scanner.nextInt();
        
    
        if(hero==1)
        {
        players.add(new Character(name, 100, 15, 10));
        }
        
        else if(hero==2)
        {
        players.add(new Character(name, 100, 8, 15));  
        }
        
        else
        {
        players.add(new Character(name, 125, 10, 10));    
        }
        
        
        
    }
    
    //creates cyclops with predetermined stats
     public static void createCyclops(Scanner scanner, ArrayList<Character> monsters) 
    {
    // Character character = new Character();    
        
    monsters.add(new Character("Cyclops", 100, 5, 15));   

    // return character;
    }
        
    
}










