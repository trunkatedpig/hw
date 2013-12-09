public class Turtle{
    
    private String name;
    private int age;
    private int speed;

    public Turtle(){
	name = "Bob";
	age = 12;
	speed = 24;
    }

    public Turtle(String turtlename){
	name = turtlename;
	age = 12;
	speed = 24;
    }

    public Turtle(String turtlename, int turtleage, int turtlespeed){
	name = turtlename;
	age = turtleage;
	speed = turtlespeed;
    }

    public void speedUp(int n){
	speed = speed + n;
    }

    public void slowDown(int n){
	speed = speed - n;
    }

    public void getOlder(){
	age = age + 1;
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
