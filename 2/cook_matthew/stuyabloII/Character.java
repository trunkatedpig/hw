public class Character {
   
    protected String name;
    protected int health;
    

    public Character() {
	name="Barry";
	health=20;
    }

    
    public Character(String name) {
	this.name = name;
	this.health=20;
    }
    
    public String toString() {
	return name;
    }

    public void attack(Character other) {
	other.loseHealth(5);
	return "Generic attack";
    }
    public getHealth() {
	return health;
    }
    public void loseHealth(int n) {
	health=health-n;
    }


}
