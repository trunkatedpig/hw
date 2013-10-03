import java.io.*;
import java.util.*;

public class Turtle {

    private String name1;
    private int age;
    private int speed;

    public Turtle () {
	name1 = "Mott";
	age = 40;
	speed = 10;
    }

    public Turtle (String n) {
	name1 = n;
	age = 10;
	speed = 30;
    }

    public Turtle (String n, int a, int s) {
	name1 = n;
	age = a;
	speed = s;
    }

    public void speedUp (int u) {
        speed = speed + u;
    }

    public void slowDown (int d) {
	speed = speed - d;
    }

    public void getOlder () {
	age = age + 1;
    }

    public String getName () {
	return name1;
    }

    public int getAge () {
	return age;
    }

    public int getSpeed () {
	return speed;
    }
}
