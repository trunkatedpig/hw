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

    public String getname () {
	return name;
    }

    public int getspeed () {
	return speed;
    }

    public int getage () {
	return age;
    }
    
    public void setAge (int a) {
	a=age;
    }

    public void setSpeed (int s) {
	s=speed;
    }

    public void setName (String n) {
	n=name;
    }

}
