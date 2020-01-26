import java.util.Random;

/*
    Knight Class
    The Knight has decent attack with high defense
*/

public class Knight extends Character {

    Random rand = new Random();

    private double strength;
    //private int damage;
    private double defense;

    public Knight() {
    }

    public Knight(String name, int strength, int defense, int special) {
        setName(name);
        setClassName("Knight");
        setMaxHealth(5);
        setCurrentHealth(5);
        setPoints(0);
        setStrength(strength);
        setDefense(defense);
        setSpecial(special);
    }

    ;
    
    /*
        Knight has 1/8th the strength the user sends in
     */
    public double attack() {

        //Setting the strength to be weaker than the strength sent it, else the Knight would be overpowered
        strength = getStrength() * (1.0 / 8);

        //Knight attacks with random number
        double attack = (strength + Math.random() * 2);
        setStrength((int) attack);

        System.out.println("The Knight attacked for " + attack + " points!");

        return attack;
    }

    /*
        Method used for the Knight to defend itself;
     */
    public double defend() {

        defense = getDefense() * Math.random() * 5;
        System.out.println(getName() + " defended itself!");
        return defense;
    }

    /*
        The Knight's special ability doubles its attack power
     */
    public void specialEffect() {

        strength = getStrength() * 2;
        System.out.println("The Knight raised it's attack power!");
    }

}