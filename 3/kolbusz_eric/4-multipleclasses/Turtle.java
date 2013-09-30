import java.io.*;
import java.util.*;

public class Turtle {

    public String name;
    public int age, speed;
    

    public Turtle() {
	setStats("Fred",4,3);
    }

    public Turtle(String n) {
	setStats(n,5,1);
    }

    public Turtle(String n, int a, int v) {
	setStats(n,a,v);
    }

	
    public void setStats(String n, int a, int v) {
	name = n;
	age = a;
	speed = v;
    }


    public void speedUp(int n) {
	speed = speed + n;
    }

    public void slowDown(int n) {
	speed = speed - n;
    }

    public void getOlder() {
	age = age + 1;
    }


    public String getName() {
	return name;
    }

    public int getAge() {
	return age;
    }

    public int getSpeed() {
	return speed;
    }
    
    public void getStats() {
	System.out.println("Turtle " + name + " with age " + age + " and speed " + speed + ".");
    }
}


