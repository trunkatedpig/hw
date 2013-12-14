import java.io.*;
import java.util.*;

public class Turtle {
    private int speed;
    private int age;
    private String name;
    
    public Turtle() {
	setName("Joey");
	setAge(16);
	setSpeed(32);
    }

    public Turtle(String name) {
	setName(name);
	setAge(25);
	setSpeed(50);
    }

    public Turtle(String name, int age, int speed) {
	setName(name);
	setAge(age);
	setSpeed(speed);
    }

    public void speedUp(int n) {
	setSpeed (speed + n);
    }

    public void slowDown (int n) {
	setSpeed (speed - n);
    }

    public void getOlder() {
	setAge (age + 1);
    }

    public String getName () {
	return name;
    }

    public int getSpeed () {
	return speed;
    }

    public int getAge () {
	return age;
    }

    public void setAge (int a) {
	age=a;
	    }

    public void setSpeed (int s) {
	speed=s;
	    }

    public void setName (String n) {
	name=n;

	}

	

}
