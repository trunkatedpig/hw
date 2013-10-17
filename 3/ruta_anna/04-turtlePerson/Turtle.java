import java.io.*;
import java.util.*;

public class Turtle {

	private String name;
	private int age;
	private int speed;

/* Creation of 3 construtors that can call the Turtle method */

	public Turtle() {
		setName("Robert");
		setAge(2);
		setSpeed(14);
	}

	public Turtle(String n) {
		setName(n);
		setAge(13);
		setSpeed(4);
	}

	public Turtle(String n, int a, int s) {
		setName(n);
		setAge(a);
		setSpeed(s);
	}

/* Gives the instance variables a value */

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setSpeed(int s) {
		speed = s;
	}

/* Set basic get methods */

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSpeed() {
		return speed;
	}

/* Manipulate the set values of the instance variables */

	public void speedUp(int s) {
		speed = speed + s;
	}

	public void slowDown(int s) {
		speed = speed - s;
	}

	public void getOlder() {
		age = age + 1;
	}
}