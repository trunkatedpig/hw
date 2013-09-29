import java.io.*;
import java.util.*;

public class Turtle {
	private String name;
	private int age;
	private int speed;
	
	// Constructors
	public Turtle() {
		setName("Kevin Li");
		setAge(15);
		setSpeed(0);
	}
	public Turtle(String n) {
		setName(n);
		setAge(15);
		setSpeed(0);
	}
	public Turtle(String n,int a,int s) {
		setName(n);
		setAge(a);
		setSpeed(s);
	}
		
	// Methods for turtles
	// Turtle specific methods
	public void speedUp(int n) {
		speed = speed + n;
	}
	public void slowDown(int n) {
		speed = speed - n;
	}
	public void getOlder()	{
		age = age + 1;
	}
	
	// Set methods
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setSpeed(int s) {
		speed = s;
	}
	
	// Get methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSpeed() {
		return speed;
	}
}
