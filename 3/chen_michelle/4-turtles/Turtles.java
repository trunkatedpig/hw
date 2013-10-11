import java.io*;
import java.util*;

public class Turtles{
    private int speed, age;
    private String name;

    public Turtles() {
	setSpeed (1);
	setAge (1);
	setName ("Turtie");
    }
    
    public Turtles (int s, int a, String n)  {
	setSpeed (s);
	setAge (a);
	setName (n);
    }

    public void getSpeed(int s) {
	speed = s;
    }

    public void getName (String n) {
	name = n;
    }

    public void getAge (int a) {
	age = a;
    }

    public void speedUp (int n) {
	speed = speed + n;
    }

    public void slowDown (int n) {
	speed = speed - n;
    }

    public void getOlder() {
	age = age + 1;
    }
}
