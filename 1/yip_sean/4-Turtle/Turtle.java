public class Turtle {
    private String name;
    private int age, speed;

    public Turtle() {
	name = "Turtle";
	age = 0;
	speed = 1;
    }

    public Turtle(String name) {
	this.name = name;
	age = 0;
	speed = 1;
    }

    public Turtle(String name, int age, int speed) {
	this.name = name;
	this.age = age;
	this.speed = speed;
    }

    public void speedUp(int n) {speed += n;}

    public void slowDown(int n) {speed -= n;}

    public void getOlder() {age += 1;}

    public String getName() {return name;}

    public int getAge() {return age;}

    public int getSpeed() {return speed;}

    public void printAllInformation() {
	System.out.println(getName());
	System.out.println(getAge());
	System.out.println(getSpeed());
    }
}
