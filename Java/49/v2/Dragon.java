public class Dragon extends Monster {
    //constructor
    public Dragon() {
	health = 175;
	strength = (int) (Math.random() * 50 + 25);
	defense = 30;
	attackRate = 1;
    }
    public String toString() {
	    return "Dragon" + super.toString();
    }
}
