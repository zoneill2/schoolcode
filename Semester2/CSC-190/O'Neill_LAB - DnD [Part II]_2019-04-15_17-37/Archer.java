import java.util.Random;

/*
    Mage Class
    The Mage has high attack with low defense
*/

public class Archer extends Character {

    Random rand = new Random();
    
    private double strength;
    //private int damage;
    private double defense;


    //Default Constructor
    public Archer() {
    }

    public Archer(String name, int strength, int defense, int special) {
        setName(name);
        setClassName("Archer");
        setMaxHealth(5);
        setCurrentHealth(5);
        setPoints(0);
        setStrength(strength);
        setDefense(defense);
        setSpecial(special);
    }

    ;

    /*
        Mage has 1/4th the strength the user sends in
     */
    public double attack() {

        //Setting the strength to be weaker than the strength sent it, else the Mage would be overpowered
        double strength = getStrength() * (1.0 / 3);

        //Mage attacks with random number
        double attack = (strength + Math.random() * 2);

        System.out.println("The archer attacked for " + attack + " points!");

        return attack;
    }

    /*
        Method used for the Mage to defend itself;
     */
    public double defend() {

        double defense = getDefense() * Math.random() * 2;
        System.out.println(getName() + " defended itself!");
        return defense;
    }

    /*
        Mage's special ability: self healing
        Able to heal half of it's current health
     */
    public void specialEffect() {

       //int roll = ((int)(Math.random()*6))+1
       //if (roll == 1)
      // {
       defense = getDefense() * 2;    
      // }
       
      System.out.println("The archer raised it's speed!");
       
    }

}