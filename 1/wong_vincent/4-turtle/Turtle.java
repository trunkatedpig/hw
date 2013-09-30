import java.io.*;
import java.util.*;

public class Turtle {
    private String name;
    private int age,speed;


    //constructor that accepts no parameters
    public Turtle () {
	name = "Mike";
	age = 10;
	speed = 50;
    }
   
    //constructor that accepts name, age, and speed
    public Turtle (String z, int i, int b) {
	name = z;
	age = i;
	speed = b;
    }

    //constructor that only accepts name
    public Turtle (String z) {
	name = z;
	age = 20;
	speed = 60;
    }


    //method that adds n to the current speed
    public void speedUp(int n) {
	speed = speed + n;
    }

    //method that subtracts n from the speed
    public void slowDown(int n) {
	speed = speed - n;
    }

    //method that adds one to the age
    public void getOlder() {
	age = age + 1;
    }

    //method that returns the speed
    public int getspeed() {
	return speed;
    }
    
    //method that returns the name
    public String getname() {
	return name;
    }

    //method that returns the age
    public int getage() {
	return age;
    }
}
	
