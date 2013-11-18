// Jeffrey He and Dmitriy Kagno

import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age,speed;

    public Turtle() {
	speedUp(1);
	age = 0;
	name = "Tom";
    }
    
    public Turtle(String nameG) {
	age = 0;
	getOlder();
	name = nameG;
	
    }

    public Turtle(String nameGiven, int ageG, int speedG) {
	name = nameGiven;
	age = ageG;
	speed = speedG;
	
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
    public int getSpeed() {
	return speed;
    }
    public int getAge() {
	return age;
    }
    public String getName() {
	return name;
    }
    public String getResult(){
	return getName() + " " + getAge() + " " + getSpeed();
    }
}