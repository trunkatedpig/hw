import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age,speed;

    // Constructors
    public Turtle() {
	name = "Eugene";
	age = 17;
	speed = 0;
    }
    public Turtle(String n) {
	name = n;
	age = 17;
	speed = 0;
    }
    public Turtle(String n,int a,int s) {
	name = n;
	age = a;
	speed = s;
    }
    // Methods
    public void speedUp(int n) {
	speed = speed + n;
    }
    public void slowDown(int n) {
	speed = speed - n;
    }
    public void getOlder() {
	age++; // ++ steps a integer by 1
	// age = age + 1;
    }
    // Get methods
    public int getSpeed() {
	return speed;
    }
    public String getName() {
	return name;
    }
    public int getAge() {
	return age;
    }
}