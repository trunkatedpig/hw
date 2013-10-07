public class Turtle {
    private String name;
    private int age;
    private int speed;
    
    public Turtle() {
	name = "Basic Turtle";
	age = 0;
	speed = 1;
    }
    public Turtle(String n) {
	name = n;
	age = 0;
	speed = 5;
    }
    
    public void speedUp(int n) {
	speed += n;
    }
    public void slowDown(int n) {
	speed -= n;
    }
    public void getOlder(){
	age += 1;
    }
    
    public String getName(){
	return name;
    }
    public int getAge(){
	return age;
    }
    public int getSpeed(){
	return speed;
    }
}
