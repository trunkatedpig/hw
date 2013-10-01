import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age,speed;

    public Turtle(String n) {
        name = n;
        age = 1;
        speed = 5;
    }

    public Turtle(String n, int s, int a) {
        name = n;
        age = a;
        speed = s;
    }

    public Turtle() {
        name = "Charles";
	age =  1;
	speed = 5;

    }
    
    public void speedUp(int n) {
	speed = speed + n;

    }

    public void slowDown(int n) {
    	speed = speed - n;

    }
    
    public void GetOlder() {
	age = age + 1;
    
    }

    public int getSpeed() {
	return speed;

    }
    
    public int getAge() {
	return age;

    }

    public String getName() {
	return name;

    }
}

/* Fish Milnikiewicz and Aida Piccato, Pd. 2 */
