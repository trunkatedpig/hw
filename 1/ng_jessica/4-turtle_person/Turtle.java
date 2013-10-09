//SAPPHA O'MEARA AND JESSICA NG

import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int speed;
    private int age;

    public Turtle() {
	name = "Tom";
	speed = 5;
	age = 10;
    }

    public Turtle(String n) {
	name = n;
	speed = 5;
	age = 10;
    }
    
    public Turtle(String n, int s, int a) {
	name = n;
	speed = s;
	age = a;
    }

    public void speedUp (int x) {
	speed = speed + x; 
    }

    public void speedDown (int x) {
	speed = speed - x; 
    }

    public void getOlder () {
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
