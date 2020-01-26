import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        System.out.println("Welcome to DnD! Choose one of the options below!");

        ArrayList < Character > player = new ArrayList < Character > ();
        Scanner in = new Scanner(System.in);
        boolean done = false;


        while (!done) {


            //displays user menu
            System.out.println("1. Create Character. ");
            System.out.println("2. See Character List. ");
            System.out.println("3. Fight Characters. ");
            System.out.println("4. Add Skill Points. ");
            System.out.println("5. Quit. ");

            int choice = in .nextInt();

            //chooses option based on user input
            if (choice == 1) {
                createCharacter( in , player);

            } else if (choice == 2) {
                listCharacter( in , player);
            } else if (choice == 3) {
                if (player.size() <= 1) {
                    System.out.println("Not enough players to fight!");
                } else {
                    fightCharacter( in , player);
                }
            } else if (choice == 4) {
                if (player.size() <= 1) {
                    System.out.println("Not enough playerst!");
                } else {
                    addExp( in , player);
                }
            } else if (choice == 5) {
                System.out.println("\nThanks for Playing!");
                done = true;
            } else {
                System.out.println("\nPlease Enter a Valid Option!\n");
            }




        } //while   




    } //main




    public static void createCharacter(Scanner in , ArrayList < Character > player) {

        int strength = 0;
        int defense = 0;
        int special = 0;
        int currentPoints = 0;
        int classPick = 0;
        boolean done = false;

        System.out.println("Time to create your character!");

        while (!done) {

            System.out.println("Choose a Class to see stats!");
            System.out.println("1.Knight!");
            System.out.println("2.Archer!");
            System.out.println("3.Mage!");

            int choice = in .nextInt();

            //doesnt allow user to pick a class not available
            while (choice > 3 || choice < 0) {
                System.out.println("Invalid Option! Try Again.");
                choice = in .nextInt();
            }

            //displays knights stats
            if (choice == 1) {
                System.out.println("Knight:");
                System.out.println("Strength: 2");
                System.out.println("Defense: 5");
                System.out.println("Special: 0");
                System.out.println("Do you want to use this class? 1-Yes 2-No");
                choice = in .nextInt();

                if (choice == 1) {
                    classPick = 1;
                    done = true;
                } else {
                    System.out.println();
                }

            } else if (choice == 2) { //displays archers stats
                System.out.println("Archer:");
                System.out.println("Strength: 5");
                System.out.println("Defense: 0");
                System.out.println("Special: 2");
                System.out.println("Do you want to use this class? 1-Yes 2-No");
                choice = in .nextInt();

                if (choice == 1) {
                    classPick = 2;
                    done = true;
                } else {
                    System.out.println();
                }



            } else if (choice == 3) { //displays mages stats
                System.out.println("Mage:");
                System.out.println("Strength: 0");
                System.out.println("Defense: 2");
                System.out.println("Special: 5");
                System.out.println("Do you want to use this class? 1-Yes 2-No");
                choice = in .nextInt();

                if (choice == 1) {
                    classPick = 3;
                    done = true;
                } else {
                    System.out.println();
                }


            } else {
                System.out.println("Invalid Input");
            }

        }

        if (classPick == 1) {
            strength = 2;
            defense = 5;
            special = 0;
            currentPoints = 20;
        } else if (classPick == 2) {
            strength = 5;
            defense = 0;                    //depending on choice of class stats are set
            special = 2;
            currentPoints = 20;
        } else {
            strength = 0;
            defense = 2;
            special = 5;
            currentPoints = 20;
        }

        while (currentPoints != 0) { //run until out of points
            if (currentPoints == 0) { //if points is 0 stop
                break;
            } else {
                System.out.println();
            }

            System.out.println("Enter the amount of points you would like to add to Strength!");
            System.out.println("You currently have " + currentPoints + " points!");
            int points = in .nextInt();

            while (points > currentPoints) {
                System.out.println("Invalid Option!"); //doesnt allow user to add more points than they have
                points = in .nextInt();
            }

            currentPoints = currentPoints - points; //takes users choice from total
            strength = strength + points;   //adds points to strength
            System.out.println("Strength " + strength);
            System.out.println("Defense " + defense);
            System.out.println("Special " + special);

            if (currentPoints == 0) {  //stop if points is 0
                break;
            } else {
                System.out.println();
            }

            System.out.println("Enter the amount of points you would like to add to Defense!");
            System.out.println("You currently have " + currentPoints + " points!");
            points = in .nextInt();
            while (points > currentPoints) {
                System.out.println("Invalid Option!"); //doesnt allow user to add more points than they have
                points = in .nextInt();
            }

            currentPoints = currentPoints - points; //takes users choice from total
            defense = defense + points; //adds points to defense
            System.out.println("Strength " + strength);
            System.out.println("Defense " + defense);
            System.out.println("Special " + special);

            if (currentPoints == 0) { //stop if points is 0
                break;
            } else {
                System.out.println();
            }

            System.out.println("Enter the amount of points you would like to add to Special!");
            System.out.println("You currently have " + currentPoints + " points!");
            points = in .nextInt();
            while (points > currentPoints) {
                System.out.println("Invalid Option!"); //doesnt allow user to add more pooints than they have
                points = in .nextInt();
            }

            currentPoints = currentPoints - points; //takes users choice from total
            special = special + points; //adding points to special
            System.out.println("Strength " + strength);
            System.out.println("Defense " + defense);
            System.out.println("Special " + special);
        }

        System.out.println("Choose a name for your hero!");
        String name = in .nextLine();
        name = in .nextLine();

        if (classPick == 1) {
            Knight knight = new Knight(name, strength, defense, special); //creating knight
            player.add(knight);
        } else if (classPick == 2) {
            Archer archer = new Archer(name, strength, defense, special); //creating archer
            player.add(archer);
        } else {
            Mage mage = new Mage(name, strength, defense, special); //creating mage
            player.add(mage);
        }


    } //createCharacter


    public static void listCharacter(Scanner in , ArrayList < Character > player) {
        if (player.size() <= 0) {
            System.out.println("There are no players created!"); //if players is 0 then dont run
        }

        for (int i = 0; i < player.size(); i++) {
            System.out.println("Player " + (i + 1) + ": " + player.get(i)); //else display players
        }

    } //listCharacter



    public static void fightCharacter(Scanner in , ArrayList < Character > player) {
        int choice1;
        int choice2;


        for (int i = 0; i < player.size(); i++) { //displays players
            System.out.println("Player " + (i + 1) + ": \n\tName: " + player.get(i).getName() + "\n\tClass: " + player.get(i).getClassName());
        }

        System.out.println("Choose Player 1: "); //chooses player 1
        choice1 = in .nextInt();
        choice1 = choice1 - 1;

        System.out.println("Choose Player 2: "); //chooses player 2
        choice2 = in .nextInt();
        choice2 = choice2 - 1;


        System.out.println("You selected : " + player.get(choice1).getName() + " V.S. " + player.get(choice2).getName());
        Character p1 = player.get(choice1); //coverts choice to p1
        Character p2 = player.get(choice2); //converts choice to p2
        Battle b = new Battle(p1, p2); //battles players

        Character[] result = b.superSmash();
        result[0].setPoints(3); //sets player who won to have 3 points 
        System.out.println(result[0].getName() + " was given 3 points for winning! You can now add more attribute points to the character!");


    } //fightCharacter    



    public static void addExp(Scanner in , ArrayList < Character > player) {

        boolean done2 = false;
        int choiced = 0;

        while (!done2) {


            for (int i = 0; i < player.size(); i++) { //lists players
                System.out.println("Player " + (i + 1) + ": \n\tName: " + player.get(i).getName() + "\n\tClass: " + player.get(i).getClassName());
            }

            System.out.println("Which character do you wish to add points too?"); //player chooses player to add exp to 
            int choicePoint = in .nextInt();
            choicePoint = choicePoint - 1;

            System.out.println("Player " + (choicePoint + 1) + ": \n\tName: " + player.get(choicePoint).getName() + "\n\tClass: " + player.get(choicePoint).getClassName()); //gets the player choice and lists its name and class


            System.out.println("Is this the player you'd like to select? 1-Yes 2-No"); //confirming pick
            int choice = in .nextInt();

            if (choice == 1) { //confirming pick
                if (player.get(choicePoint).getPoints() <= 0) { //if player has no points then dont run
                    System.out.println("\nThis player had no points!\n");
                } else { //if player has exp points then exit while loop
                    System.out.println();
                    choiced = choicePoint;
                    done2 = true;
                }
            } else {
                System.out.println();
            }


        }

        int currentPoints = player.get(choiced).getPoints(); //setting variables
        int strength = 0;       
        int defense = 0;
        int special = 0;

        while (currentPoints != 0) {


            System.out.println("Strength " + player.get(choiced).getStrength());
            System.out.println("Defense " + player.get(choiced).getDefense());
            System.out.println("Special " + player.get(choiced).getSpecial());



            if (currentPoints == 0) {
                break;
            } else {
                System.out.println();
            }

            System.out.println("Enter the amount of points you would like to add to Strength!");
            System.out.println("You currently have " + currentPoints + " points!");
            int points = in .nextInt();
            while (points > currentPoints) { //doesnt allow user to add more points than they have
                System.out.println("Invalid Option!");
                points = in .nextInt();
            }

            currentPoints = currentPoints - points;
            player.get(choiced).setStrength(player.get(choiced).getStrength() + points); //sets users strength as current strength + points
            player.get(choiced).setPoints(player.get(choiced).getPoints() - points); //takes players choice of points and takes it from players exp

            System.out.println("Strength " + player.get(choiced).getStrength());
            System.out.println("Defense " + player.get(choiced).getDefense());
            System.out.println("Special " + player.get(choiced).getSpecial());

            if (currentPoints == 0) {
                break;
            } else {
                System.out.println();
            }

            System.out.println("Enter the amount of points you would like to add to Defense!");
            System.out.println("You currently have " + currentPoints + " points!");
            points = in .nextInt();
            while (points > currentPoints) { //doesnt allow user to add more points than they have
                System.out.println("Invalid Option!");
                points = in .nextInt();
            }

            currentPoints = currentPoints - points;
            player.get(choiced).setDefense(player.get(choiced).getDefense() + points); //sets users strength as current defense + points
            player.get(choiced).setPoints(player.get(choiced).getPoints() - points); //takes players choice of points and takes it from players exp

            System.out.println("Strength " + player.get(choiced).getStrength());
            System.out.println("Defense " + player.get(choiced).getDefense());
            System.out.println("Special " + player.get(choiced).getSpecial());


            if (currentPoints == 0) {
                break;
            } else {
                System.out.println();
            }

            System.out.println("Enter the amount of points you would like to add to Special!");
            System.out.println("You currently have " + currentPoints + " points!");
            points = in .nextInt();
            while (points > currentPoints) { //doesnt allow user to add more points than they have
                System.out.println("Invalid Option!");
                points = in .nextInt();
            }

            currentPoints = currentPoints - points;
            player.get(choiced).setSpecial(player.get(choiced).getSpecial() + points); //sets users strength as current special + points
            player.get(choiced).setPoints(player.get(choiced).getPoints() - points); //takes players choice of points and takes it from players exp

            System.out.println("Strength " + player.get(choiced).getStrength());
            System.out.println("Defense " + player.get(choiced).getDefense());
            System.out.println("Special " + player.get(choiced).getSpecial());

        }

    } //addExp




} //whole thing