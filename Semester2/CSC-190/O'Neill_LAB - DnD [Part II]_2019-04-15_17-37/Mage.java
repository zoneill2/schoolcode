import java.util.Random;

/*
    Mage Class
    The Mage has high attack with low defense
*/

public class Mage extends Character {

    Random rand = new Random();


    //Default Constructor
    public Mage() {
    }

    public Mage(String name, int strength, int defense, int special) {
        setName(name);
        setClassName("Mage");
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
        double strength = getStrength() * (1.0 / 4);

        //Mage attacks with random number
        double attack = (strength + Math.random() * 2);

        System.out.println("The Mage attacked for " + attack + " points!");

        return attack;
    }

    /*
        Method used for the Mage to defend itself;
     */
    public double defend() {

        double defense = getDefense() * Math.random() * 3;
        System.out.println(getName() + " defended itself!");
        return defense;
    }

    /*
        Mage's special ability: self healing
        Able to heal half of it's current health
     */
    public void specialEffect() {

        int newHealth = getCurrentHealth() / 2;
        /*
            Setting the max health.
            If the new health that is regenerated is > 5
            The current health is set to 5
         */
        if ((getCurrentHealth() + newHealth) > getMaxHealth())
            setCurrentHealth(5);
        else
            setCurrentHealth(getCurrentHealth() + newHealth);

        System.out.println("The mage healed itself! The new health is: " + getCurrentHealth());
    }

}