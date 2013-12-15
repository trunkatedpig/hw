import java.io.*;
import java.util.*;

public class Turtle {
   
    private String name;
    private int age;
    private int speed;

    public Turtle() {
	setName("Crush");
	setAge(5);
	setSpeed(1);
    }

    public Turtle(String n) {
	setName(n);
	setAge(5);
	setSpeed(1);
    }

    public Turtle(String n,int a,int s) {
	setName(n);
	setAge(a);
	setSpeed(s);
    }

    public void setName(String n) {
	name = n;
    }

    public void setAge(int n) {
	age = n;
    }

    public void setSpeed(int n) {
	speed = n;
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
}
