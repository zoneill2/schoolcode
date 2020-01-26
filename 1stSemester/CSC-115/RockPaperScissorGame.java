import java.util.Scanner; //importing scanner

public class RockPaperScissorGame //naming the program
{

   public static void main (String [] args)
  
      {
      int player1; //variable player1
      int player2; //variable player2
      
      Scanner in = new Scanner (System.in); //calling scanner
      System.out.print("Let's play Rock, Paper, Scissors!"); //Introduction
      System.out.println();//space 
      System.out.println();// space
      System.out.print("Player 1 Choose.... [1]Rock  [2]Paper  [3]Scissors  "); //asking player 1 their choice
      player1 = in.nextInt(); //setting player 1's choice as "player1" variable
      if (player1 > 3 || < 1)
      {
      System.out.println("non valid")
      }
      System.out.print("Player 2 Choose.... [1]Rock  [2]Paper  [3]Scissors  "); //asking player 2 their choice
      player2 = in.nextInt(); //setting player 2's choice as "player2" variable
      
      System.out.println();
      System.out.println("ROCK");
      System.out.println();
      System.out.println("PAPER");
      System.out.println();          //This is all a intro into the winner
      System.out.println("SCISSORS");
      System.out.println();
      System.out.println("SHOOT!");
      System.out.println();
    
      if (player1 == 1 && player2 == 2) //if player1 picks rock and if player2 picks paper
      {
      System.out.println("Player 2 Wins!!!"); //announce winner
      }
      
      else if (player2 > 3)
      {
      System.out.println("Nice Try! Pick an actual choice!");
      }
      
      else if (player1 > 3)
      {
      System.out.println("Nice Try! Pick an actual choice!");
      }
                                                               //This section makes it so the user must use 1,2 or 3.
      else if (player2 < 1)
      {
      System.out.println("Nice Try! Pick an actual choice!");
      }
      
      else if (player1 < 1)
      {
      System.out.println("Nice Try! Pick an actual choice!");
      }
      
      else if (player1 == 2 && player2 == 3) //if player1 picks paper and if player 2 picks scissors
      {
      System.out.println("Player 2 Wins!!!"); //announce winner
      }
      
      else if (player1 == 3 && player2 == 1) //if player1 picks scissors and player2 picks rock
      {
      System.out.println("Player 2 Wins!!!"); //acounce a winner
      }
      
      else if (player1 == player2) //if player1 and player2 pick the same choice
      {
      System.out.println("Draw!!!"); //announce a tie
      }
      
      else
      {
      System.out.println("Player 1 Wins!!!"); //in any other instance player1 wins, so announce winner
      
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
      
      