public class Protagonist extends Character { //Not Tested
    public String name;
    
    public int initdefense;
    public double initattack;

/*    public Protagonist (String input) {
        name = input;
        health = 125;
        strength = 100;
        defense = initdefense = 40;
        attackRate = initattack = 0.4;
    }*/
    
    public String toString () {
        return name + "\n health: " + health + "\n strength: " + strength + " \n defense: " + defense + " \n attackRate: " + attackRate;
    }
    
    public String getName(){ return name; }
    
    public int special = 5;
    public void specialize(){
        defense -= special;
        attackRate += special;
    }
    
    public void normalize(){
        defense = initdefense;
        attackRate = initattack;
    }
}
