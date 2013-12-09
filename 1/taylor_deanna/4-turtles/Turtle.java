import java.io.*;
import java.util.*;

public class Turtle {
    String name;
    int age, speed;

    // Constructors
    public Turtle() {
	setName("Joey");
	setAge(16);
	setSpeed(32);
    }
    public Turtle(String n) {
	setName(n);
	setAge(16);
	setSpeed(32);
    }
    public Turtle(String n,int a, int s) {
	setName(n);
	setAge(a);
	setSpeed(s);
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

    // set methods

    public void setName(String n) {
	name = n;
    }
    public void setAge(int a) {
	age = a;
    }
    public void setSpeed(int s) {
	speed = s;
    }

	
}