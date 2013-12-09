import java.util.*;
import java.io.*;

public class Turtle {

    private int speed;
    private int age;
    private String name;

    public Turtle () {
	//int speed;
	//int age;
	name = "Fred the turtle";
    }

    public Turtle(String name){
	speed = 4;
	age = 2;
    }

    public void speedUp(int n){

	speed = speed + n;

	// this adds n to the current speed (n is an int)

    }

    public void slowDown(int n) { 
	
	speed = speed - n;
	// subtracts n from the speed
	
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
}
